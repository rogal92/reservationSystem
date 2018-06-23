package com.example.reservation.ui.forms.payment.view.m;

import com.example.reservation.entities.PaymentMethod;
import com.example.reservation.ui.forms.payment.model.PaymentMethodComboBoxModel;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.swing.*;
import java.awt.*;

@Component
public class PaymentFormPanel extends JPanel {

    private static final int LAYOUT_ROWS = 3;
    private static final int LAYOUT_COLS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int TEXT_FIELD_COLUMNS = 20;

    @Autowired
    private PaymentFormButtonPanel paymentFormButtonPanel;

    private JComboBox<PaymentMethod> paymentMethodJComboBox;
    private JTextField valueJTF;
    private  jDateChooser  jDateChooser;

    private PaymentMethodComboBoxModel paymentMethodComboBox;

    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(LAYOUT_ROWS,LAYOUT_COLS,HORIZONTAL_GAP,VERTICAL_GAP));
    }

    private void initComponents() {
        JLabel paymentMethodLbl= new JLabel(NameType.PAYMENT_METHOD);
        JLabel valueLbl = new JLabel(NameType.VALUE);
        JLabel dateOfPayment = new JLabel(NameType.DATE_OF_PAYMENT);

        paymentMethodJComboBox = new JComboBox<>(paymentMethodComboBox);
        valueJTF = new JTextField(TEXT_FIELD_COLUMNS);
    }
}
