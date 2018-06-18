package com.example.reservation.ui.forms.client.view;

import com.example.reservation.util.DialogContent;
import com.example.reservation.util.NameType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;

public class ClientFrame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;

    @Autowired
    private ClientTableButtonPanel clientTableButtonPanel;

    @Autowired
    private ClientTablePanel clientTablePanel;

    public ClientFrame(ClientTableButtonPanel clientTableButtonPanel, ClientTablePanel clientTablePanel) throws HeadlessException {
        this.clientTableButtonPanel = clientTableButtonPanel;
        this.clientTablePanel = clientTablePanel;
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setTitle(NameType.CLIENTS);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
    }

    private void initComponents() {
        add(clientTablePanel, BorderLayout.CENTER);
        add(clientTableButtonPanel, BorderLayout.SOUTH);
    }

    public ClientTableButtonPanel getClientTableButtonPanel() {
        return clientTableButtonPanel;
    }

    public ClientTablePanel getClientTablePanel() {
        return clientTablePanel;
    }
}
