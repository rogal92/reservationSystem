package com.example.reservation.ui.forms.address.controller;

import com.example.reservation.ui.Shared.controller.AbstractFrameController;
import com.example.reservation.ui.forms.address.model.AddressTableModel;
import com.example.reservation.ui.forms.address.view.AddressTablePanel;
import com.example.reservation.ui.forms.address.view.m.AddAddressFrame;
import com.example.reservation.validation.AddressValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AddressController extends AbstractFrameController {

    @Autowired
    AddressTablePanel addressTablePanel;

    @Autowired
    AddAddressFrame addAddressFrame;

    @Autowired
    AddressTableModel addressTableModel;

    @Autowired
    AddressValidation addressValidation;

    @Override
    public void prepareAndOpenFrame() {

    }
}
