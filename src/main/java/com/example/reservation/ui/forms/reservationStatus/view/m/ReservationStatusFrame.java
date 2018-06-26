package com.example.reservation.ui.forms.reservationStatus.view.m;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ReservationStatusFrame extends JFrame {

    @Autowired
    private ReservationStatusButtonPanel buttonPanel;

    @Autowired
    private ReservationStatusTablePanel tablePanel;

    public ReservationStatusFrame(ReservationStatusTablePanel tablePanel, ReservationStatusButtonPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
        this.tablePanel = tablePanel;
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setTitle(NameType.RESERVATION_STATUSES);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void initComponents() {
        add(tablePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public ReservationStatusButtonPanel getButtonPanel() {
        return buttonPanel;
    }

    public ReservationStatusTablePanel getTablePanel() {
        return tablePanel;
    }
}
