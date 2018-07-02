package com.example.reservation.ui.forms.treatment.view;

import com.example.reservation.ui.forms.treatment.model.TreatmentTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentTablePanel extends JPanel {

    @Autowired
    private TreatmentTableModel tableModel;

    private JTable table;

    public TreatmentTablePanel(TreatmentTableModel tableModel) {
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

        JScrollPane paneWithScroll = new JScrollPane(table);
        add(paneWithScroll, BorderLayout.CENTER);
    }
}
