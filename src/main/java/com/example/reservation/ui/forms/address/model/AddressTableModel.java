package com.example.reservation.ui.forms.address.model;

import com.example.reservation.entities.Address;
import com.example.reservation.ui.shared.model.DefaultTableModel;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressTableModel extends DefaultTableModel<Address> {

    @Autowired
    Address address;

    @Override
    public String[] getColumnLabels() {
        return new String[] {
                NameType.CITY,
                NameType.POSTAL_CODE,
                NameType.STREET,
                NameType.HOUSE_NUMBER,
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        address = entities.get(rowIndex);

        switch (columnIndex) {
            case 0: return address.getCity();
            case 1: return address.getPostCode();
            case 2: return address.getStreet();
            case 3: return address.getHouseNumber();
            default: return "";
        }
    }
}