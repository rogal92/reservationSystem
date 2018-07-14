package com.example.reservation.ui.forms.address.controller;

import com.example.reservation.entities.Address;
import com.example.reservation.service.AdressService;
import com.example.reservation.ui.forms.address.view.AddressTableFrame;
import com.example.reservation.ui.forms.address.view.m.AddressFormPanel;
import com.example.reservation.ui.shared.controller.AbstractFrameController;
import com.example.reservation.ui.forms.address.model.AddressTableModel;
import com.example.reservation.ui.forms.address.view.AddressTablePanel;
import com.example.reservation.ui.forms.address.view.m.AddAddressFrame;
import com.example.reservation.util.Messages;
import com.example.reservation.util.Notifications;
import com.example.reservation.validation.AddressValidation;
import com.example.reservation.validation.ValidationError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Controller
public class AddressController extends AbstractFrameController {

    @Autowired
    private AddressTablePanel addressTablePanel;

    @Autowired
    private AddAddressFrame addAddressFrame;

    @Autowired
    private AddressTableModel addressTableModel;

    @Autowired
    private AddressValidation addressValidation;

    @Autowired
    private AddressTableFrame addressTableFrame;

    @Autowired
    private AdressService addressService;

    public AddressController(AddressTablePanel addressTablePanel, AddAddressFrame addAddressFrame, AddressTableModel addressTableModel,
                             AddressValidation addressValidation, AdressService addressService, AddressTableFrame addressTableFrame) {
        this.addressTablePanel = addressTablePanel;
        this.addAddressFrame = addAddressFrame;
        this.addressTableModel = addressTableModel;
        this.addressValidation = addressValidation;
        this.addressService = addressService;
        this.addressTableFrame = addressTableFrame;
    }

    @Override
    public void prepareAndOpenFrame() {
        loadEntities();
        show();

    }

    private void loadEntities() {
        List<Address> entities = addressService.findAll();
        addressTableModel.clear();
        addressTableModel.addEntities(entities);
    }

    private void show() {
        addressTableFrame.setVisible(true);
    }

    private void showModal() {
        addAddressFrame.setVisible(true);
    }

    private void closeModal() {
        addAddressFrame.getAddressFormPanel().clear();
        addAddressFrame.dispose();
    }

    private void saveEntity() {
        Address entity = addAddressFrame.getAddressFormPanel().getEntityFromForm();
        Optional<ValidationError> validationError = addressValidation.validate(entity);
        if (validationError.isPresent()) {
            Notifications.showFormValidationAlert(validationError.get().getMessage());
        } else {
            addressService.save(entity);
            addressTableModel.addEntity(entity);
            closeModal();
        }
    }
    private void removeEntity() {
        try {
            JTable table = addressTableFrame.getAddressTablePanel().getTable();
            int selectedRow = table.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(
                        null,
                        Messages.NON_ROW_SELECTED,
                        Messages.ALERT,
                        JOptionPane.ERROR_MESSAGE);
            } else {
                Address entity = addressTableModel.getEntityByRow(selectedRow);
                addressService.remove(entity);
                addressTableModel.removeRow(selectedRow);
            }
        } catch (Exception e) {
            Notifications.showDeleteRowErrorMessage();
        }
    }
}