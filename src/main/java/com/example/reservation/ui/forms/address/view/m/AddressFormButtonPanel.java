package com.example.reservation.ui.forms.address.view.m;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class AddressFormButtonPanel extends JPanel {

    private JButton saveButton;
    private JButton cancelButton;

    public AddressFormButtonPanel() {
        initComponents();
    }

    private void initComponents() {
        saveButton = new JButton(NameType.ADD);
        cancelButton = new JButton(NameType.REMOVE);

        add(saveButton);
        add(cancelButton);
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
