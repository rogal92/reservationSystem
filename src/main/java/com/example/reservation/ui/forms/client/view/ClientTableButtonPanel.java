package com.example.reservation.ui.forms.client.view;

import com.example.reservation.util.NameType;

import javax.swing.*;

public class ClientTableButtonPanel extends JPanel {

    private JButton addButton;
    private JButton removeButton;

    public ClientTableButtonPanel() {}

    private void initComponents() {
        addButton = new JButton(NameType.ADD;
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
