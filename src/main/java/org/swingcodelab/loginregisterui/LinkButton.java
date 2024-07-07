package org.swingcodelab.loginregisterui;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class LinkButton extends JButton {

    public LinkButton() {
        setBorder(null);
        setContentAreaFilled(false);
        setForeground(new Color(0, 100, 200));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
