package com.example.reservation.ui.forms.paymentMethod.view.m;

import com.example.reservation.entities.PaymentMethod;
import com.example.reservation.util.Borders;
import com.example.reservation.util.DialogContent;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class PaymentMFormPanel extends JPanel {

    private static final int LAYOUT_ROWS = 1;
    private static final int LAYOUT_COLS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int TEXT_FIELD_COLUMNS = 20;

    private JTextField paymentMethodJTF;

    public PaymentMFormPanel() {
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(LAYOUT_ROWS,LAYOUT_COLS,HORIZONTAL_GAP,VERTICAL_GAP));
    }

    private void initComponents() {
        JLabel paymentMJL = new JLabel(NameType.PAYMENT_METHOD);
        paymentMethodJTF = new JTextField(TEXT_FIELD_COLUMNS);
        add(paymentMJL);
        add(paymentMethodJTF);
    }

    public PaymentMethod getEntityFromForm() {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setMethodName(paymentMethodJTF.getText());
        return paymentMethod;
    }
    public void clear() {
        paymentMethodJTF.setText("");
    }
}
