package com.example.reservation.ui.forms.reservation.view;

import com.example.reservation.ui.forms.reservation.model.ReservationTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ReservationTablePanel extends JPanel {

    @Autowired
    private ReservationTableModel reservationTableModel;

    private JTable table;

    public ReservationTablePanel(ReservationTablePanel reservationTablePanel, JTable table) {
        this.reservationTableModel = reservationTablePanel;
        this.table = table;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        table = new JTable(reservationTableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(table);

        add(paneWithTable, BorderLayout.CENTER);
    }
}
