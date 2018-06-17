package com.example.reservation.ui.forms.address.view;

import com.example.reservation.ui.forms.address.model.AddressTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddressTablePanel extends JPanel {

    @Autowired
    AddressTableModel addressTableModel;

    private JTable table;

    public AddressTablePanel() {
        setPanelUp();
        initComponents();
    }


    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        table = new JTable(addressTableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public JTable getTable() {
        return table;
    }
}
