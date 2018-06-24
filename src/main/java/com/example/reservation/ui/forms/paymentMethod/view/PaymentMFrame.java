package com.example.reservation.ui.forms.paymentMethod.view;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class PaymentMFrame  extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    @Autowired
    private PaymentMTableButtonPanel tableButtonPanel;

    @Autowired
    private PaymentMTablePanel tablePanel;

    public PaymentMFrame(PaymentMTableButtonPanel tableButtonPanel, PaymentMTablePanel tablePanel) throws HeadlessException {
        this.tableButtonPanel = tableButtonPanel;
        this.tablePanel = tablePanel;
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setSize(WIDTH,HEIGHT);
        setTitle(NameType.PAYMENT_METHOD);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        add(tablePanel, BorderLayout.CENTER);
        add(tableButtonPanel, BorderLayout.SOUTH);
    }

    public PaymentMTableButtonPanel getTableButtonPanel() {
        return tableButtonPanel;
    }

    public PaymentMTablePanel getTablePanel() {
        return tablePanel;
    }
}
