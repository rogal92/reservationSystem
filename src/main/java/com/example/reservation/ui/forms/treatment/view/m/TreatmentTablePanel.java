package com.example.reservation.ui.forms.treatment.view.m;

import com.example.reservation.entities.Treatment;
import com.example.reservation.entities.TreatmentType;
import com.example.reservation.ui.forms.treatment.model.TreatmentTypeComboBoxModel;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentTablePanel extends JPanel {

    private static final int LAYOUT_ROWS = 3;
    private static final int LAYOUT_COLS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int TEXT_FIELD_COLUMNS = 20;

    private JSpinner peopleNr;
    private JTextField nameJTF;
    private JComboBox<TreatmentType> treatmentTypeJComboBox;


    @Autowired
    private TreatmentTypeComboBoxModel comboBoxModel;

    public TreatmentTablePanel(TreatmentTypeComboBoxModel comboBoxModel) {
        this.comboBoxModel = comboBoxModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(LAYOUT_ROWS,LAYOUT_COLS,HORIZONTAL_GAP,VERTICAL_GAP));
    }

    private void initComponents() {
        JLabel treatmentTypeJL = new JLabel(NameType.TREATMENT_TYPE);
        JLabel treatmentNameJL = new JLabel(NameType.TREATMENT);


        //jspinner

        nameJTF = new JTextField(TEXT_FIELD_COLUMNS);
        treatmentTypeJComboBox = new JComboBox<>(comboBoxModel);

        add(treatmentTypeJL);
        add(treatmentTypeJComboBox);
    }

    public void getEntityFromForm() {
        Treatment treatment = new Treatment();
        treatment.setTreatmentType(treatmentTypeJComboBox.getSelectedItem());
        treatment.setTreatmentName(nameJTF.getText());
        return treatment;
    }

    public void clear() {
        nameJTF.setText("");
    }
}
