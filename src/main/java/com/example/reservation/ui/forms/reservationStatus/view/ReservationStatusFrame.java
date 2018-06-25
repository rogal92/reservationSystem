package com.example.reservation.ui.forms.reservationStatus.view;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ReservationStatusFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    public ReservationStatusFrame() {
        setFrameUp();
        initComponents();
    }

    @Autowired
    private ReservationStatusTablePanel tablePanel;

    @Autowired
    private ReservationStatusTableButtonPanel tableButtonPanel;

    private void setFrameUp() {
        setTitle(NameType.RESERVATION_STATUSES);
        setVisible(true);
        setResizable(false);
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        add(tablePanel, BorderLayout.CENTER);
        add(tableButtonPanel, BorderLayout.SOUTH);
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }
}
