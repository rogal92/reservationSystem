package com.example.reservation.ui.forms.client.view.m;

import com.example.reservation.util.DialogContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AddClientFrame  extends JDialog {

    @Autowired
    private FormPanel formPanel;

    @Autowired
    private FormButtonPanel formButtonPanel;

    public AddClientFrame(FormPanel formPanel, FormButtonPanel formButtonPanel) {
        this.formPanel = formPanel;
        this.formButtonPanel = formButtonPanel;

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
        add(formPanel, BorderLayout.CENTER);
        add(formButtonPanel, BorderLayout.SOUTH);
    }

    public FormPanel getFormPanel() {
        return formPanel;
    }

    public FormButtonPanel getFormButtonPanel() {
        return formButtonPanel;
    }
}
