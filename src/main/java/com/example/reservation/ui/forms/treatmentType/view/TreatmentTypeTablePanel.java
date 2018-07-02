package com.example.reservation.ui.forms.treatmentType.view;

import com.example.reservation.ui.forms.treatmentType.model.TreatmentTypeTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentTypeTablePanel extends JPanel {

    @Autowired
    private TreatmentTypeTableModel tableModel;

    private JTable table;

    public TreatmentTypeTablePanel(TreatmentTypeTableModel tableModel) {
        this.tableModel = tableModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(table);
        add(paneWithTable, BorderLayout.CENTER);
    }
}
