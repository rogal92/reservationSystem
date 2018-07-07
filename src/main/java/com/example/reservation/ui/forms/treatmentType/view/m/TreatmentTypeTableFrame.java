package com.example.reservation.ui.forms.treatmentType.view.m;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentTypeTableFrame extends JDialog {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;

    @Autowired
    private TreatmentTypeTablePanel tablePanel;

    @Autowired
    private TreatmentTypeButtonPanel buttonPanel;

    private void setFrameUp() {
        setSize(WIDTH,HEIGHT);
        setTitle(NameType.TREATMENT_TYPES);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void initComponents() {
        add(buttonPanel, BorderLayout.SOUTH);
        add(tablePanel, BorderLayout.CENTER);
    }

    public TreatmentTypeTablePanel getTablePanel() {
        return tablePanel;
    }

    public TreatmentTypeButtonPanel getButtonPanel() {
        return buttonPanel;
    }
}
