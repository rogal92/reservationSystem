package com.example.reservation.ui.forms.reservation.view.m;

import com.example.reservation.entities.Client;
import com.example.reservation.entities.Payment;
import com.example.reservation.entities.Reservation;
import com.example.reservation.entities.ReservationStatus;
import com.example.reservation.time.CurrentTime;
import com.example.reservation.ui.forms.reservation.model.ClientCOmboBoxModel;
import com.example.reservation.ui.forms.reservation.model.PaymentComboBoxModel;
import com.example.reservation.ui.forms.reservation.model.ReservationStatusComboBoxModel;
import com.example.reservation.ui.forms.reservation.model.ReservationTableModel;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

@Component
public class ReservationFormPanel extends JPanel {

    private static final int LAYOUT_ROWS = 6;
    private static final int LAYOUT_COLS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int TEXT_FIELD_COLUMNS = 20;

    private UtilDateModel dateModel;
    private JDatePanelImpl panelImpl;
    private JDatePickerImpl datePickerImpl;

    private JTextField amountTF;
    private CurrentTime currentTime;

    @Autowired
    private ClientCOmboBoxModel clientCOmboBoxModel;
    @Autowired
    private ReservationStatusComboBoxModel reservationStatusComboBoxMode;
    @Autowired
    private PaymentComboBoxModel paymentComboBoxModel;
    @Autowired
    private ReservationTableModel tableModel;

    public ReservationFormPanel(UtilDateModel dateModel, JDatePanelImpl panelImpl,
                                JDatePickerImpl datePickerImpl, JTextField amountTF, CurrentTime currentTime,
                                ClientCOmboBoxModel clientCOmboBoxModel, ReservationStatusComboBoxModel reservationStatusComboBoxMode,
                                PaymentComboBoxModel paymentComboBoxModel, ReservationTableModel tableModel) {
        this.dateModel = dateModel;
        this.panelImpl = panelImpl;
        this.datePickerImpl = datePickerImpl;
        this.amountTF = amountTF;
        this.currentTime = currentTime;
        this.clientCOmboBoxModel = clientCOmboBoxModel;
        this.reservationStatusComboBoxMode = reservationStatusComboBoxMode;
        this.paymentComboBoxModel = paymentComboBoxModel;
        this.tableModel = tableModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(LAYOUT_ROWS,LAYOUT_COLS,HORIZONTAL_GAP,VERTICAL_GAP));
    }

    private void initComponents() {

        JLabel clientLbl = new JLabel(NameType.CLIENT);
        JLabel paymentLbl = new JLabel(NameType.PAYMENT);
        JLabel dateLbl = new JLabel(NameType.RESERVATION_DATE);
        JLabel amountLbl = new JLabel(NameType.AMOUNT);
        JLabel reservationStatusLbl = new JLabel(NameType.RESERVATION_STATUS);


        JComboBox<ReservationStatus> reservationStatusJComboBox = new JComboBox<>(reservationStatusComboBoxMode);
        JComboBox<Payment> paymentJComboBox = new JComboBox<>(paymentComboBoxModel);
        JComboBox<Client> clientJComboBox = new JComboBox<>(clientCOmboBoxModel);

        dateModel = new UtilDateModel();
        panelImpl = new JDatePanelImpl(dateModel);
        datePickerImpl = new JDatePickerImpl(panelImpl);
        amountTF = new JTextField(TEXT_FIELD_COLUMNS);

        add(reservationStatusLbl)
        add(reservationStatusJComboBox);
        add(paymentLbl);
        add(paymentJComboBox);
        add(clientLbl);
        add(clientJComboBox);
        add(dateLbl);
        add(datePickerImpl);
        add(amountLbl);
        add(amountTF);
    }

    public Reservation getReservationFromForm() {
        Reservation reservation = new Reservation();
        reservation.setReservationStatus(reservationStatusComboBoxMode.getSelectedItem());

        reservation.setReservationDate((Date) datePickerImpl);

        reservation.setClient(clientCOmboBoxModel.getSelectedItem());
        reservation.setAmount(amountTF);
        reservation.setPayment(paymentComboBoxModel.getSelectedItem());
        return reservation;
    }

    public void clearForm() {
        amountTF.setText("");
    }
}
