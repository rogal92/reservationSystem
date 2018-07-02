package com.example.reservation.ui.forms.treatmentType.view;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentTypeFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    public TreatmentTypeFrame() {
        setFrameUp();
        initComponents();
    }

    @Autowired
    private TreatmentTypeTableButton tableButton;

    @Autowired
    private TreatmentTypeTablePanel tablePanel;

    private void setFrameUp() {
        setSize(WIDTH,HEIGHT);
        setTitle(NameType.TREATMENT_TYPES);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    private void initComponents() {
        add(tableButton, BorderLayout.SOUTH);
        add(tablePanel, BorderLayout.CENTER);
    }

    public TreatmentTypeTableButton getTableButton() {
        return tableButton;
    }

    public TreatmentTypeTablePanel getTablePanel() {
        return tablePanel;
    }
}
