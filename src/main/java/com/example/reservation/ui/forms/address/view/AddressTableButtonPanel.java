package com.example.reservation.ui.forms.address.view;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class AddressTableButtonPanel extends JPanel {

    private JButton addButton;
    private JButton removeButton;

    public AddressTableButtonPanel() {}

    private void initComponents() {
        addButton = new JButton(NameType.ADD);
        removeButton = new JButton(NameType.REMOVE);

        add(addButton);
        add(removeButton);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }
}
