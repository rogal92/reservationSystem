package com.example.reservation.ui.forms.client.model;

import com.example.reservation.entities.Client;
import com.example.reservation.ui.shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

@Component
public class ClientTableModel extends DefaultTableModel<Client> {

    @Override
    public String[] getColumnLabels() {
        return new String[] {
                NameType.ADDRESS,
                NameType.NAME,
                NameType.SURNAME,
                NameType.PHONE_NUMBER,
                NameType.EMAIL;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client client = entities.get(rowIndex);

        switch (columnIndex) {
            case 0:
                client.getAddress();
            case 1:
                client.getName();
            case 2:
                client.getSurname();
            case 3:
                client.getPhoneNumber();
            case 4:
                client.geteMail();
            default:
                return "";
        }
    }
}
