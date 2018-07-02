package com.example.reservation.ui.forms.treatment.view;

import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentTableFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    @Autowired
    private TreatmentTablePanel tablePanel;

    @Autowired
    private TreatmentTableButtonPanel tableButtonPanel;

    public TreatmentTableFrame(TreatmentTablePanel tablePanel, TreatmentTableButtonPanel tableButtonPanel) {
        this.tablePanel = tablePanel;
        this.tableButtonPanel = tableButtonPanel;
        setFrameUp();
        initComponets();
    }

    private void setFrameUp() {
        setSize(WIDTH,HEIGHT);
        setTitle(NameType.TREATMENTS);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponets() {
        add(tablePanel, BorderLayout.CENTER);
        add(tableButtonPanel, BorderLayout.SOUTH);
    }

    public TreatmentTablePanel getTablePanel() {
        return tablePanel;
    }

    public TreatmentTableButtonPanel getTableButtonPanel() {
        return tableButtonPanel;
    }
}
