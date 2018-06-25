package com.example.reservation.ui.forms.reservation.view.m;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ReservationFormButtonPanel extends JPanel {

    private JButton addButton,cancelButton;

    public ReservationFormButtonPanel() {
        initComponents();
    }

    private void initComponents() {
        addButton = new JButton(NameType.ADD);
        cancelButton = new JButton(NameType.REMOVE);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
