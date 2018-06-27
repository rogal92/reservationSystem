package com.example.reservation.ui.forms.treatmentReservation.view;

import com.example.reservation.ui.forms.treatmentReservation.model.TreatmentReservationTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentReservationTablePanel extends JPanel {

    @Autowired
    private TreatmentReservationTableModel treatmentReservationTableModel;

    private JTable table;

    public TreatmentReservationTablePanel(TreatmentReservationTableModel treatmentReservationTableModel) {
        this.treatmentReservationTableModel = treatmentReservationTableModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        table = new JTable(treatmentReservationTableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(table);
        add(paneWithTable, BorderLayout.CENTER);
    }
}
