package com.example.reservation.ui.forms.client.view.m;

import com.example.reservation.util.NameType;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ClientFormButtonPanel extends JPanel {

    private JButton save, cancel;

    private void initComponents() {
        save = new JButton(NameType.ADD);
        cancel = new JButton(NameType.REMOVE);

        add(save);
        add(cancel);
    }

    public JButton getSave() {
        return save;
    }

    public JButton getCancel() {
        return cancel;
    }
}
