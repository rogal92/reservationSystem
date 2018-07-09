package com.example.reservation.ui.forms.reservation.model;

import com.example.reservation.entities.Reservation;
import com.example.reservation.ui.shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class ReservationTableModel extends DefaultTableModel<Reservation> {

    @Override
    public String[] getColumnLabels() {
        return new String[]{
                NameType.CLIENT,
                NameType.PAYMENT,
                NameType.RESERVATION_DATE,
                NameType.VALUE;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservation reservation = entities.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return reservation.getClient();
            case 1:
                return reservation.getPayment();
            case 2:
                return reservation.getReservationDate();
            case 3:
                return reservation.getAmount();
            default:
                return "";
        }
    }
}
