package com.example.reservation.ui.forms.treatmentReservation.view;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentReservtationTableFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    @Autowired
    private TreatmentReservationButtonPanel buttonPanel;

    @Autowired
    private TreatmentReservationTablePanel tablePanel;

    private void setFrameUp() {
        setSize(WIDTH,HEIGHT);
        setTitle(NameType.TREATMENT_RESERVATIONS);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        add(buttonPanel,BorderLayout.SOUTH);
        add(tablePanel,BorderLayout.CENTER);
    }

    public TreatmentReservationButtonPanel getButtonPanel() {
        return buttonPanel;
    }

    public TreatmentReservationTablePanel getTablePanel() {
        return tablePanel;
    }
}
