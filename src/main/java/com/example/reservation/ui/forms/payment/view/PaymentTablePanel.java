package com.example.reservation.ui.forms.payment.view;

import com.example.reservation.ui.forms.payment.model.PaymentTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

@Component
public class PaymentTablePanel extends JPanel {

    @Autowired
    private PaymentTableModel paymentTableModel;

    private JTable table;

    public PaymentTableModel(PaymentTableModel paymentTableModel) {
        this.paymentTableModel = paymentTableModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        table = new JTable(paymentTableModel);
        table.setSelectionMode(SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(table);
        add(paneWithTable, BorderLayout.CENTER);
    }

    public JTable getTable() {
        return table;
    }
}
