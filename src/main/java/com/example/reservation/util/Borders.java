package com.example.reservation.util;

import javax.swing.*;
import javax.swing.border.Border;

public class Borders {

    private static final int WIDTH = 50;
    private static final int HEIGHT = 30;

    public static Border createEmptyBorder() {
        return BorderFactory.createEmptyBorder(WIDTH, HEIGHT, WIDTH, HEIGHT);
    }
}
