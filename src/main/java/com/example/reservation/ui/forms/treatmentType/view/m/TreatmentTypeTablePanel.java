package com.example.reservation.ui.forms.treatmentType.view.m;

import com.example.reservation.entities.TreatmentType;
import com.example.reservation.ui.forms.treatmentType.model.TreatmentTypeTableModel;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentTypeTablePanel extends JPanel {

    private static final int ROWS = 3;
    private static final int COLUMNS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int TEXT_FIELD_COLUMNS = 20;

    private JTextField descriptionJTF;

    @Autowired
    private TreatmentTypeTableModel tableModel;

    public TreatmentTypeTablePanel(TreatmentTypeTableModel tableModel) {
        this.tableModel = tableModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(ROWS,COLUMNS,HORIZONTAL_GAP,VERTICAL_GAP));
    }

    private void initComponents() {
        JLabel descriptionLbl = new JLabel(NameType.TREATMENT_TYPE_DESCRIPTION);
        descriptionJTF = new JTextField(TEXT_FIELD_COLUMNS);

        add(descriptionLbl);
        add(descriptionJTF);
    }

    public TreatmentType getEntityFromForm() {
        TreatmentType treatmentType = new TreatmentType();

        treatmentType.setTreatmentDescription(descriptionJTF.getText());
    }

    public void clear() {
        descriptionJTF.setText("");
    }
}
