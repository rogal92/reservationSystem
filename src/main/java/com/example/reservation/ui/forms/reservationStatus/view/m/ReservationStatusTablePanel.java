package com.example.reservation.ui.forms.reservationStatus.view.m;

import com.example.reservation.entities.ReservationStatus;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ReservationStatusTablePanel extends JPanel {

    private static final int LAYOUT_ROWS = 1;
    private static final int LAYOUT_COLS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int TEXT_FIELD_COLUMNS = 20;

    private JTextField reservationStatusJTF;

    public ReservationStatusTablePanel() {
        setPanelup();
        initComponents();
    }

    private void setPanelup() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(LAYOUT_ROWS,LAYOUT_COLS,HORIZONTAL_GAP,VERTICAL_GAP));
    }

    private void initComponents() {
        reservationStatusJTF = new JTextField(TEXT_FIELD_COLUMNS);
        JLabel reservationStatusLbl = new JLabel(NameType.RESERVATION_STATUS);

        add(reservationStatusLbl);
        add(reservationStatusJTF);
    }

    public ReservationStatus getEntityFromForm() {
        ReservationStatus reservationStatus = new ReservationStatus();
        reservationStatus.setReservationStatus(reservationStatusJTF.getText());

        return reservationStatus;
    }

    public void clear() {
        reservationStatusJTF.setText("");
    }
}
