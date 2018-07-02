package com.example.reservation.ui.forms.treatment.view.m;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentFrame extends JDialog {

    @Autowired
    private TreatmentButtonPanel buttonPanel;

    @Autowired
    private TreatmentTablePanel tablePanel;

    public TreatmentFrame(TreatmentButtonPanel buttonPanel, TreatmentTablePanel tablePanel) {
        this.buttonPanel = buttonPanel;
        this.tablePanel = tablePanel;
        setFrameUp();
        initCOmponents();
    }

    private void setFrameUp() {
        setTitle(NameType.TREATMENT);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    private void initCOmponents() {
        add(buttonPanel, BorderLayout.SOUTH);
        add(tablePanel, BorderLayout.CENTER);
    }

    public TreatmentButtonPanel getButtonPanel() {
        return buttonPanel;
    }

    public TreatmentTablePanel getTablePanel() {
        return tablePanel;
    }
}
