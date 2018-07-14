package com.example.reservation.ui.forms.client.view.m;

import com.example.reservation.entities.Address;
import com.example.reservation.entities.Client;
import com.example.reservation.util.Borders;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ClientFormPanel extends JPanel {

    private static final int LAYOUT_ROWS = 6;
    private static final int LAYOUT_COLS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;
    private static final int JFIELD = 20;

    private JTextField nameTF, surnameTF, phoneNumberTF, emailTF;
    private JComboBox<Address> addressCombo;

    @Autowired
    public ClientFormPanel() {
        setPanelUp();
        initComponents();
    }
    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(LAYOUT_ROWS, LAYOUT_COLS, HORIZONTAL_GAP, VERTICAL_GAP));
    }

    private void initComponents() {

        JLabel addressLbl = new JLabel(NameType.ADDRESS);
        JLabel nameLbl = new JLabel(NameType.NAME);
        JLabel surnameLbl = new JLabel(NameType.SURNAME);
        JLabel phoneNymberLbl = new JLabel(NameType.PHONE_NUMBER);
        JLabel emailLbl = new JLabel(NameType.EMAIL);

        nameTF = new JTextField(JFIELD);
        surnameTF = new JTextField(JFIELD);
        phoneNumberTF = new JTextField(JFIELD);
        emailTF = new JTextField(JFIELD);
        phoneNumberTF = new JTextField(JFIELD);
        addressCombo = new JComboBox<>();


        add(nameLbl);
        add(nameTF);
        add(surnameLbl);
        add(surnameTF);
        add(phoneNymberLbl);
        add(phoneNumberTF);
        add(emailLbl);
        add(emailTF);
        add(addressLbl);
        add(addressCombo);
    }

    public Client getClientFromForm() {
        Client client = new Client();
        client.setName(nameTF.getText());
        client.setSurname(surnameTF.getText());
        client.setPhoneNumber(phoneNumberTF.getText());
        client.seteMail(emailTF.getText());
        client.setAddress(addressCombo.getSelectedItem());
    }

    public void clearForm() {
        nameTF.setText("");
        surnameTF.setText("");
        phoneNumberTF.setText("");
        emailTF.setText("");
        addressCombo.setSelectedIndex(0);
    }
}
