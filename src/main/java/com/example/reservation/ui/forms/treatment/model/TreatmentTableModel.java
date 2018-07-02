package com.example.reservation.ui.forms.treatment.model;

import com.example.reservation.entities.Treatment;
import com.example.reservation.ui.Shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class TreatmentTableModel extends DefaultTableModel<Treatment> {
    @Override
    public String[] getColumnLabels() {
        return new String[] {
                NameType.TREATMENT,
                NameType.TREATMENT_TYPE
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Treatment treatment = entities.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return treatment.getTreatmentName();
            case 0:
                return treatment.getTreatmentType();
            default:
                return "";
        }
    }
}
