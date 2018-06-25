package com.example.reservation.ui.forms.paymentMethod.view.m;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddPaymentMFrame extends JFrame {

    @Autowired
    private PaymentMFormPanel formPanel;

    @Autowired
    private PaymentMFormButtonPanel formButtonPanel;

    public AddPaymentMFrame(PaymentMFormPanel formPanel, PaymentMFormButtonPanel formButtonPanel) throws HeadlessException {
        this.formPanel = formPanel;
        this.formButtonPanel = formButtonPanel;
    }

    private void setFrameUp() {
        setTitle(NameType.PAYMENT_METHODS);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    private void initComponents() {
        add(formPanel, BorderLayout.CENTER);
        add(formButtonPanel, BorderLayout.SOUTH);
    }

    public PaymentMFormPanel getFormPanel() {
        return formPanel;
    }

    public PaymentMFormButtonPanel getFormButtonPanel() {
        return formButtonPanel;
    }
}
