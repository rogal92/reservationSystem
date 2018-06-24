package com.example.reservation.ui.forms.payment.model;

import com.example.reservation.entities.Payment;
import com.example.reservation.ui.Shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class PaymentTableModel extends DefaultTableModel<Payment> {
    @Override
    public String[] getColumnLabels() {
        return new String[] {
                NameType.PAYMENT_METHOD,
                NameType.VALUE,
                NameType.DATE_OF_PAYMENT;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Payment payment = entities.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return payment.getPaymentMethod(paymentMethodComboBoxModel.getSelectedItem());
            case 1:
                return payment.getValue(Long.valueOf(valueJTF.getText()));
            case 2:
                return payment.getPaymentsDate();
            default:
                return "";
        }
    }
}
