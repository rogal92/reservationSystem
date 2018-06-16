package com.example.reservation.util;

import javax.swing.*;

public class UIManager {
    public static void setWindowsLF() {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Messages.WINDOWS_STYLE_LOADING_ERROR_MESSAGE + e,
                    Messages.ALERT, JOptionPane.ERROR_MESSAGE);
        }
    }
}
