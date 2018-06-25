package com.example.reservation.ui.forms.reservation.view;

import com.example.reservation.util.Messages;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

@Component
public class ReservationFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    @Autowired
    private ReservationTablePanel tablePanel;

    @Autowired
    private ReservationButtonPanel buttonPanel;

    public ReservationFrame(ReservationTablePanel tablePanel, ReservationButtonPanel buttonPanel) throws HeadlessException {
        this.tablePanel = tablePanel;
        this.buttonPanel = buttonPanel;
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setTitle(NameType.RESERVATIONS);
        setVisible(true);
        setResizable(false);
        setSize(WIDTH,HEIGHT);
    }

    private void initComponents() {
        add(tablePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public ReservationTablePanel getTablePanel() {
        return tablePanel;
    }

    public ReservationButtonPanel getButtonPanel() {
        return buttonPanel;
    }
}
