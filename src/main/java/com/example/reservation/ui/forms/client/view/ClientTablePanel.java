package com.example.reservation.ui.forms.client.view;

import com.example.reservation.ui.forms.client.model.ClientTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ClientTablePanel extends JPanel {

    @Autowired
    private ClientTableModel clientTableModel;

    private JTable clientTable;

    private ClientTablePanel(JTable clientTable, ClientTableModel clientTableModel) {
        this.clientTable = clientTable;
        this.clientTableModel = clientTableModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        jTable = new JTable(clientTableModel);
        jTable.setSelectionModel(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(clientTable);
        add(paneWithTable, BorderLayout.CENTER);
    }

    public ClientTableModel getClientTableModel() {
        return clientTableModel;
    }

    public JTable getClientTable() {
        return clientTable;
    }
}
