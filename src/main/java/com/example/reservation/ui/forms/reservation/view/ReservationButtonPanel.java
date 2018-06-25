package com.example.reservation.ui.forms.reservation.view;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ReservationButtonPanel extends JPanel {

    private JButton addBtn, deleteBtn;

    public ReservationButtonPanel() {
        initComponents();
    }

    private void initComponents() {
        addBtn = new JButton(NameType.ADD);
        deleteBtn = new JButton(NameType.REMOVE);
        add(addBtn);
        add(deleteBtn);
    }

    public JButton getAddBtn() {
        return addBtn;
    }

    public JButton getDeleteBtn() {
        return deleteBtn;
    }
}
