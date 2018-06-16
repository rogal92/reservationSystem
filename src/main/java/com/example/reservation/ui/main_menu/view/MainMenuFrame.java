package com.example.reservation.ui.main_menu.view;

import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainMenuFrame extends JFrame {

    private JButton reservationButton, reportsButton;

    public MainMenuFrame() {
        setFrame();
        initComponents();
        pack();
    }

    private void setFrame() {
        getRootPane().setBorder(Borders.createEmptyBorder());
        setTitle(NameType.MAIN_MENU);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1,2,20,20));
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        reservationButton = new JButton(NameType.RESERVATION);
        reportsButton = new JButton(NameType.REPORTS);

        add(reportsButton);
        add(reservationButton);
    }

    public JButton getReservationButton() {
        return reservationButton;
    }

    public JButton getReportsButton() {
        return reportsButton;
    }
}

