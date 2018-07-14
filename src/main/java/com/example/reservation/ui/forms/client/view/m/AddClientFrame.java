package com.example.reservation.ui.forms.client.view.m;

import com.example.reservation.util.DialogContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddClientFrame  extends JDialog {

    @Autowired
    private ClientFormPanel clientFormPanel;

    @Autowired
    private ClientFormButtonPanel clientFormButtonPanel;

    public AddClientFrame(ClientFormPanel clientFormPanel, ClientFormButtonPanel clientFormButtonPanel) {
        this.clientFormPanel = clientFormPanel;
        this.clientFormButtonPanel = clientFormButtonPanel;

        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setTitle(DialogContent.clientAdd);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setModal(true);
    }

    private void initComponents() {
        add(clientFormPanel, BorderLayout.CENTER);
        add(clientFormButtonPanel, BorderLayout.SOUTH);
    }

    public ClientFormPanel getClientFormPanel() {
        return clientFormPanel;
    }

    public ClientFormButtonPanel getClientFormButtonPanel() {
        return clientFormButtonPanel;
    }
}
