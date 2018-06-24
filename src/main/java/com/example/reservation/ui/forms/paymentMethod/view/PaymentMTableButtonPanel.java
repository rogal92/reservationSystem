package com.example.reservation.ui.forms.paymentMethod.view;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class PaymentMTableButtonPanel extends JPanel {

    private JButton addButton, deleteButton;

    public PaymentMTableButtonPanel() {
        initComponents();
    }

    private void initComponents() {
        addButton = new JButton(NameType.ADD);
        deleteButton = new JButton(NameType.REMOVE);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }
}
