package com.example.reservation.ui.forms.treatmentType.view.m;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class TreatmentTypeButtonPanel extends JPanel {

    private JButton addButton, removeButton;

    public TreatmentTypeButtonPanel() {
        initComponents();
    }

    private void initComponents() {
        addButton = new JButton(NameType.ADD);
        removeButton = new JButton(NameType.REMOVE);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }
}
