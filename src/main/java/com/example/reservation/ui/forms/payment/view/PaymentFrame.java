package com.example.reservation.ui.forms.payment.view;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class PaymentFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 300;

    private PaymentTablePanel tablePanel;
    private PaymentTableButtonPanel tableBtnPanel;

    @Autowired
    public PaymentTableFrame(PaymentTableButtonPanel tableBtnPanel, PaymentTablePanel tablePanel) {
        this.tablePanel = tablePanel;
        this.tableBtnPanel = tableBtnPanel;
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setTitle(NameType.PAYMENTS);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {
        add(tablePanel, BorderLayout.CENTER);
        add(tableBtnPanel, BorderLayout.SOUTH);
    }

    public PaymentTableButtonPanel getTableBtnPanel() {
        return tableBtnPanel;
    }

    public PaymentTablePanel getTablePanel() {
        return tablePanel;
    }
}
