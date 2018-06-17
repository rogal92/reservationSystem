package com.example.reservation.ui.forms.address.view.m;


import com.example.reservation.util.DialogContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddAddressFrame extends JDialog {

    @Autowired
    AddressFormButtonPanel addressFormButtonPanel;

    @Autowired
    AddressFormPanel addressFormPanel;

    public AddAddressFrame() {
        setFrameUp();
        initComponents();
        pack();
    }

    private void setFrameUp() {
        setTitle(DialogContent.addressAdd);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setModal(true);
    }

    private void initComponents() {
        add(addressFormPanel, BorderLayout.CENTER);
        add(addressFormButtonPanel, BorderLayout.SOUTH);
    }
}

