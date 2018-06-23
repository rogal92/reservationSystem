package com.example.reservation.ui.forms.payment.view.m;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class PaymentFormButtonPanel extends JPanel {

    private JButton addButton, cancelButton;

    public PaymentFormButtonPanel() {
       initComponents();
    }

    private void initComponents() {
        addButton = new JButton(NameType.ADD);
        cancelButton= new JButton(NameType.REMOVE);

        add(addButton);
        add(cancelButton);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
