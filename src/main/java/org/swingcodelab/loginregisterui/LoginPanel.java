package org.swingcodelab.loginregisterui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.components.FlatPasswordField;
import com.formdev.flatlaf.extras.components.FlatTextField;

public class LoginPanel extends JPanel {

    private JLabel titleLabel;
    private JLabel subTitleLabel;
    private FlatTextField nameField;
    private FlatPasswordField passwordField;
    private JButton loginButton;
    private JPanel questionPanel;
    private LinkButton linkButton;
    private Font font;

    private final AuthFrame authFrame;

    public LoginPanel(AuthFrame authFrame) {
        this.authFrame = authFrame;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(0, 1));
        setBorder(new EmptyBorder(10, 30, 10, 30));

        titleLabel = new JLabel();
        subTitleLabel = new JLabel();
        nameField = new FlatTextField();
        passwordField = new FlatPasswordField();
        loginButton = new JButton();
        questionPanel = new JPanel();
        linkButton = new LinkButton();
        font = getFont();

        titleLabel.setFont(font.deriveFont(Font.BOLD, 22));
        titleLabel.setText("Welcome Back!");
        subTitleLabel.setFont(font.deriveFont(Font.PLAIN, 16));
        subTitleLabel.setText("Please sign in to access your account");
        nameField.setPlaceholderText("Enter your name");
        passwordField.setPlaceholderText("Enter your password");
        passwordField.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        loginButton.setText("Login");
        questionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        linkButton.setText("Sign Up");
        linkButton.addActionListener(e -> authFrame.showRegister());

        questionPanel.add(new JLabel("Don't have an account?"));
        questionPanel.add(linkButton);

        add(titleLabel);
        add(subTitleLabel);
        add(new JLabel("Name"));
        add(nameField);
        add(new JLabel("Password"));
        add(passwordField);
        add(new JLabel()); //Empty label
        add(loginButton);
        add(questionPanel);
    }
}
