package org.swingcodelab.loginregisterui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.MatteBorder;

import com.formdev.flatlaf.extras.FlatSVGIcon;

public class AuthFrame extends JFrame {

    private final String LOGIN_CARD = "login";
    private final String REGISTER_CARD = "register";

    private CardLayout cardLayout;
    private JPanel cardPanel;
    private LoginPanel loginPanel;
    private RegisterPanel registerPanel;

    public AuthFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Welcome");
        setUndecorated(true);
        setIconImage(new FlatSVGIcon("icons/user.svg").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        cardLayout = new CardLayout();
        cardPanel = new JPanel();
        loginPanel = new LoginPanel(this);
        registerPanel = new RegisterPanel(this);

        cardPanel.setLayout(cardLayout);
        cardPanel.setBorder(new MatteBorder(1, 0, 0, 0, 
        new Color(130, 130, 130, 130)));
        cardPanel.add(loginPanel, LOGIN_CARD);
        cardPanel.add(registerPanel, REGISTER_CARD);
        showLogin();

        setContentPane(cardPanel);
    }

    public void showLogin() {
        cardLayout.show(cardPanel, LOGIN_CARD);
        setSize(getComponentWitdh(loginPanel) + 2, getComponentHeight(loginPanel));
        setLocationRelativeTo(null);
    }

    public void showRegister() {
        cardLayout.show(cardPanel, REGISTER_CARD);
        setSize(getComponentWitdh(registerPanel) + 2, getComponentHeight(registerPanel));
        setLocationRelativeTo(null);
    }

    public int getComponentWitdh(Component component) {
        return component.getPreferredSize().width;
    }

    public int getComponentHeight(Component component) {
        return component.getPreferredSize().height;
    }
}
