package com.example.reservation.ui.forms.Treatment.view.m;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class TreatmentButtonPanel extends JPanel {

    private JButton addButton,cancelButton;

    public TreatmentButtonPanel() {
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
