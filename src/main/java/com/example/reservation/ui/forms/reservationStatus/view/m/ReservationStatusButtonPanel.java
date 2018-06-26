package com.example.reservation.ui.forms.reservationStatus.view.m;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ReservationStatusButtonPanel extends JPanel {

    private JButton addButton,cancelButton;

    public ReservationStatusButtonPanel() {
        initComponents();
    }

    private void initComponents() {
        addButton = new JButton(NameType.ADD);
        cancelButton = new JButton(NameType.CANCEL);
        add(addButton);
        add(cancelButton);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
