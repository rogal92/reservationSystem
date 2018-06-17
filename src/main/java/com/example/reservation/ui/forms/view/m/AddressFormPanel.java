package com.example.reservation.ui.forms.view.m;

import com.example.reservation.util.Borders;
import org.springframework.stereotype.Component;
import sun.text.normalizer.VersionInfo;

import javax.swing.*;
import java.awt.*;

@Component
public class AddressFormPanel extends JPanel {

    private static final int ROWS = 4;
    private static final int COLUMNS = 2;
    private static final int HORIZONT_GAP = 0;
    private static final int VERTIC_GAP = 30;

    private void setPanelUp() {
        setBorder(Borders.createEmptyBorder());
        setLayout(new GridLayout(ROWS,COLUMNS,HORIZONT_GAP,VERTIC_GAP));
    }
}
