package com.example.reservation.ui.forms.treatmentType.model;

import com.example.reservation.entities.TreatmentType;
import com.example.reservation.ui.Shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class TreatmentTypeTableModel extends DefaultTableModel<TreatmentType> {

    @Override
    public String[] getColumnLabels() {
        return new String[] {
                NameType.TREATMENT_TYPE_DESCRIPTION
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TreatmentType treatmentType = entities.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return treatmentType.getTreatmentDescription();
            default:
                return "";
        }
    }
}
