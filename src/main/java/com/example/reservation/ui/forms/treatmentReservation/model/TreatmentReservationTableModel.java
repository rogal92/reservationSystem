package com.example.reservation.ui.forms.treatmentReservation.model;

import com.example.reservation.entities.TreatmentReservation;
import com.example.reservation.ui.shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class TreatmentReservationTableModel extends DefaultTableModel<TreatmentReservation> {
    @Override
    public String[] getColumnLabels() {
        return new String[] {
                NameType.RESERVATION,
                NameType.TREATMENT,
                NameType.PRICE;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TreatmentReservation treatmentReservation = entities.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return treatmentReservation.getReservation();
            case 1:
                return treatmentReservation.getTreatment();
            case 2:
                return treatmentReservation.getTreatmentPrice();
            default:
                return "";
        }
    }
}
