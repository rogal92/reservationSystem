package com.example.reservation.ui.forms.paymentMethod.model;

import com.example.reservation.entities.PaymentMethod;
import com.example.reservation.ui.shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class PaymentMethodTableModel extends DefaultTableModel<PaymentMethod> {


    @Override
    public String[] getColumnLabels() {
        return new String[] {
                NameType.PAYMENT_METHOD;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PaymentMethod paymentMethod = entities.get(rowIndex);
        switch (paymentMethod) {
            case 0:
                return paymentMethod.getMethodName();
            default:
                return "";
        }
    }
}
