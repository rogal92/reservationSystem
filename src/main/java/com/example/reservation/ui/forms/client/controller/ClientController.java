package com.example.reservation.ui.forms.client.controller;

import com.example.reservation.entities.Address;
import com.example.reservation.entities.Client;
import com.example.reservation.repository.ClientRepository;
import com.example.reservation.service.AdressService;
import com.example.reservation.service.ClientService;
import com.example.reservation.ui.forms.client.model.AddressComboBoxModel;
import com.example.reservation.ui.forms.client.model.ClientTableModel;
import com.example.reservation.ui.forms.client.view.ClientFrame;
import com.example.reservation.ui.forms.client.view.m.AddClientFrame;
import com.example.reservation.ui.shared.controller.AbstractFrameController;
import com.example.reservation.util.Messages;
import com.example.reservation.util.Notifications;
import com.example.reservation.validation.ClientValidation;
import com.example.reservation.validation.ValidationError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Controller
public class ClientController extends AbstractFrameController {


    @Autowired
    private ClientFrame clientFrame;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AdressService adressService;

    @Autowired
    private AddClientFrame addClientFrame;

    @Autowired
    private ClientTableModel clientTableModel;

    @Autowired
    private ClientValidation clientValidation;

    @Autowired
    private AddressComboBoxModel addressComboBoxModel;

    @Autowired
    private

    public ClientController(ClientFrame clientFrame, ClientService clientService, ClientRepository clientRepository, AdressService adressService,
                            AddClientFrame addClientFrame, ClientTableModel clientTableModel,
                            ClientValidation clientValidation, AddressComboBoxModel addressComboBoxModel) {
        this.clientFrame = clientFrame;
        this.clientService = clientService;
        this.clientRepository = clientRepository;
        this.adressService = adressService;
        this.addClientFrame = addClientFrame;
        this.clientTableModel = clientTableModel;
        this.clientValidation = clientValidation;
        this.addressComboBoxModel = addressComboBoxModel;
    }

    @Override
    public void prepareAndOpenFrame() {
        fetchClients();
        show();
    }

    private void fetchClients() {
        List<Client> clientList = clientService.findAll();
        clientTableModel.clear();
        clientTableModel.addEntities(clientList);
    }

    private void fetchAddresses() {
        List<Address> addresses = adressService.findAll();
        addressComboBoxModel.removeAll();
        addressComboBoxModel.addElements(addresses);
    }

    private void show() {
        clientFrame.setVisible(true);
    }

    private void showModal() {
        addClientFrame.setVisible(true);
    }

    private void saveEntity() {
        Client client = addClientFrame.getClientFormPanel().getClientFromForm();
        Optional<ValidationError> error = clientValidation.validate(client);

        if (error.isPresent()) {
            Notifications.showFormValidationAlert(error.get().getMessage());
        }
        clientRepository.save(client);
        clientTableModel.addEntity(client);
    }

    private void deleteEntity() {
        try {
        JTable table = clientFrame.getClientTablePanel().getClientTable();
        int selectedRow = table.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    Messages.DELETE_ROW_ERROR,
                    Messages.NON_ROW_SELECTED,
                    JOptionPane.ERROR_MESSAGE;
        } else {
            Client client = clientTableModel.getEntityByRow(selectedRow);
            clientService.remove(client);
            clientTableModel.removeRow(selectedRow);
        }
    } catch (Exception e) {
            Notifications.showDeleteRowErrorMessage();
        }
    }
}
