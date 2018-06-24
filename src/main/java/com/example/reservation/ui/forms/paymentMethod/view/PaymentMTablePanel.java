package com.example.reservation.ui.forms.paymentMethod.view;

import com.example.reservation.ui.forms.paymentMethod.model.PaymentMethodTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class PaymentMTablePanel extends JPanel {

    @Autowired
    PaymentMethodTableModel paymentMethodTableModel;

    private JTable jTable;

    public PaymentMTablePanel(PaymentMethodTableModel paymentMethodTableModel) {
        this.paymentMethodTableModel = paymentMethodTableModel;
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        jTable = new JTable(paymentMethodTableModel);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(jTable);
        add(paneWithTable, BorderLayout.CENTER);
    }

    public JTable getjTable() {
        return jTable;
    }
}