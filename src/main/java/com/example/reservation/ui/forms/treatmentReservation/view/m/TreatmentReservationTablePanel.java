package com.example.reservation.ui.forms.treatmentReservation.view.m;

import com.example.reservation.entities.TreatmentReservation;
import com.example.reservation.ui.forms.treatmentReservation.model.TreatmentReservationTableModel;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TreatmentReservationTablePanel extends JPanel {
    private static final int ROWS = 3;
    private static final int COLUMNS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int TEXT_FIELD_COLUMNS = 20;

    private JTextField treatmentPriceJTF;

    @Autowired
    private TreatmentReservationTableModel tableModel;

    public TreatmentReservationTablePanel(TreatmentReservationTableModel tableModel) {
        this.tableModel = tableModel;
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(ROWS,COLUMNS,HORIZONTAL_GAP,VERTICAL_GAP));
    }

    private void initComponents() {
        JLabel treatmentPriceLBL = new JLabel(NameType.PRICE);
        treatmentPriceJTF = new JTextField(TEXT_FIELD_COLUMNS);
        add(treatmentPriceLBL);
        add(treatmentPriceJTF);
    }

    public void getEntityFromForm() {
        TreatmentReservation treatmentReservation = new TreatmentReservation();

        treatmentReservation.setTreatmentPrice(Long.valueOf(treatmentPriceJTF.getText()));
    }

    public void clear() {
        treatmentPriceJTF.setText("");
    }
}
