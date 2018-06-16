package com.example.reservation.util;

import javax.swing.*;

public class Notifications {

    public static void showFormValidationAlert(String message) {
        JOptionPane.showMessageDialog(null,
                message,
                Messages.INFORMATION,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showDeleteRowErrorMessage() {
        JOptionPane.showMessageDialog(null,
                Messages.DELETE_ROW_ERROR,
                Messages.ALERT,
                JOptionPane.ERROR_MESSAGE);
    }
}
