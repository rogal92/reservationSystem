package com.example.reservation.ui.forms.payment.view.m;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddPaymentFrame extends JFrame {

    @Autowired
    private PaymentFormButtonPanel formButtonPanel;

    @Autowired
    private PaymentFormPanel formPanel;

    public AddPaymentFrame(PaymentFormButtonPanel formButtonPanel, PaymentFormPanel formPanel) throws HeadlessException {
        this.formButtonPanel = formButtonPanel;
        this.formPanel = formPanel;
        setFrameUp();
        initComponents();
        pack();
    }

    private void setFrameUp() {
        setTitle(NameType.PAYMENT_ADD);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    private void initComponents() {
        add(formButtonPanel, BorderLayout.SOUTH);
        add(formPanel, BorderLayout.CENTER);
    }

    public PaymentFormButtonPanel getFormButtonPanel() {
        return formButtonPanel;
    }

    public PaymentFormPanel getFormPanel() {
        return formPanel;
    }
}
