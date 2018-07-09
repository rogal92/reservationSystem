package com.example.reservation.ui.forms.reservationStatus.model;

import com.example.reservation.entities.ReservationStatus;
import com.example.reservation.ui.shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class ReservationStatusTableModel extends DefaultTableModel<ReservationStatus> {

    @Override
    public String[] getColumnLabels() {
        return new String[]{
                NameType.RESERVATION_STATUS
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ReservationStatus reservationStatus = entities.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return reservationStatus.getReservationStatus();
            default:
                return "";
        }
    }
}
