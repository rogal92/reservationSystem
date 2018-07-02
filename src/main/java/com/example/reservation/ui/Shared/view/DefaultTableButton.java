package com.example.reservation.ui.Shared.view;


import com.example.reservation.util.NameType;

import javax.swing.*;

public abstract class DefaultTableButton extends JPanel {

    private JButton addButton, deleteButton;

    protected void initComponents() {
        addButton = new JButton(NameType.ADD);
        deleteButton = new JButton(NameType.REMOVE);
        add(addButton);
        add(deleteButton);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }
}
