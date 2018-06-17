package com.example.reservation.ui.forms.address.view.m;

import com.example.reservation.entities.Address;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddressFormPanel extends JPanel {

    private static final int ROWS = 4;
    private static final int COLUMNS = 2;
    private static final int HORIZONT_GAP = 0;
    private static final int VERTIC_GAP = 30;
    private static final int TEXT_FIELD = 20;

    private JTextField streetJT, cityJT, postCodeJT, houseNrJT, flatNrJT;

    public AddressFormPanel() {
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(ROWS,COLUMNS,HORIZONT_GAP,VERTIC_GAP));
    }

    private void initComponents() {

        cityJT = new JTextField(TEXT_FIELD);
        postCodeJT = new JTextField(TEXT_FIELD);
        streetJT = new JTextField(TEXT_FIELD);
        houseNrJT = new JTextField(TEXT_FIELD);
        flatNrJT = new JTextField(TEXT_FIELD);

        JLabel streetLbl = new JLabel(NameType.FLAT_NUMBER);
        JLabel cityLbl = new JLabel(NameType.CITY);
        JLabel postCodeLbl = new JLabel(NameType.POSTAL_CODE);
        JLabel houseNrLbl = new JLabel(NameType.HOUSE_NUMBER);
        JLabel flatNrLbl = new JLabel(NameType.FLAT_NUMBER);

        add(cityLbl);
        add(cityJT);
        add(postCodeLbl);
        add(postCodeJT);
        add(streetLbl);
        add(streetJT);
        add(houseNrLbl);
        add(houseNrJT);
        add(flatNrLbl);
        add(flatNrJT);
    }

    public Address getEntityFromForm() {
        Address address = new Address();

        address.setCity(cityJT.getText());
        address.setPostCode(postCodeJT.getText());
        address.setStreet(streetJT.getText());
        address.setHouseNumber(houseNrJT.getText());
        address.setFlatNumber(flatNrJT.getText());
        return address;
    }

    public void clear() {
        cityJT.setText("");
        postCodeJT.setText("");
        streetJT.setText("");
        houseNrJT.setText("");
        flatNrJT.setText("");
    }
}
