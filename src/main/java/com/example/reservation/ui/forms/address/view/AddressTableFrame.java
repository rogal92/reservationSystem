package com.example.reservation.ui.forms.address.view;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddressTableFrame extends JFrame {

    private static final int WIDTH = 450;
    private static final int HEIGHT = 250

    @Autowired
    private AddressTablePanel addressTablePanel;

    @Autowired
    private AddressTableButtonPanel addressTableButtonPanel;

    public AddressTableFrame(AddressTablePanel addressTablePanel, AddressTableButtonPanel addressTableButtonPanel) throws HeadlessException {
        this.addressTablePanel = addressTablePanel;
        this.addressTableButtonPanel = addressTableButtonPanel;
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setTitle(NameType.ADDRESS);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        add(addressTablePanel, BorderLayout.CENTER);
        add(addressTableButtonPanel, BorderLayout.AFTER_LAST_LINE);
    }

    public AddressTablePanel getAddressTablePanel() {
        return addressTablePanel;
    }

    public AddressTableButtonPanel getAddressTableButtonPanel() {
        return addressTableButtonPanel;
    }
}
