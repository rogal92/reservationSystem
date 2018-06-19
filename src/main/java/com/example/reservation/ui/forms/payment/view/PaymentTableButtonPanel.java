package com.example.reservation.ui.forms.payment.view;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class PaymentTableButtonPanel extends JPanel {

    private JButton addButton, removeButton;

    public PaymentTableButtonPanel() {
        initComponents();
    }

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
