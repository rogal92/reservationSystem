package com.example.reservation.ui.forms.reservationStatus.view;

import com.example.reservation.ui.forms.reservationStatus.model.ReservationStatusTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ReservationStatusTablePanel extends JPanel {

    @Autowired
    private ReservationStatusTableModel tableModel;

    private JTable table;

    private void setPanelUp() {
        setLayout(setLayout(new BorderLayout());
    }

    private void initComponents() {
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(table);

        add(paneWithTable, BorderLayout.CENTER);
    }
}
