package org.swingcodelab.loginregisterui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.components.FlatPasswordField;
import com.formdev.flatlaf.extras.components.FlatTextField;

public class RegisterPanel extends JPanel {

    private JLabel titleLabel;
    private JLabel subTitleLabel;
    private JPanel fullNamePanel;
    private FlatTextField firstNameField;
    private FlatTextField lastNameField;
    private FlatTextField emailField;
    private FlatPasswordField passwordField;
    private FlatPasswordField confirmPasswordField;
    private JButton signUpButton;
    private JPanel questionPanel;
    private LinkButton linkButton;
    private Font font;

    private final AuthFrame authFrame;

    public RegisterPanel(AuthFrame authFrame) {
        this.authFrame = authFrame;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(0, 1));
        setBorder(new EmptyBorder(10, 30, 10, 30));

        titleLabel = new JLabel();
        subTitleLabel = new JLabel();
        fullNamePanel = new JPanel();
        firstNameField = new FlatTextField();
        lastNameField = new FlatTextField();
        emailField = new FlatTextField();
        passwordField = new FlatPasswordField();
        confirmPasswordField = new FlatPasswordField();
        signUpButton = new JButton();
        questionPanel = new JPanel();
        linkButton = new LinkButton();
        font = getFont();

        titleLabel.setBorder(new EmptyBorder(0, 0, 5, 0));
        titleLabel.setFont(font.deriveFont(Font.BOLD, 22));
        titleLabel.setText("Welcome to Register");
        subTitleLabel.setFont(font.deriveFont(Font.PLAIN, 16));
        subTitleLabel.setText("Please fill in your details to create your account");
        fullNamePanel.setLayout(new BoxLayout(fullNamePanel, BoxLayout.X_AXIS));
        firstNameField.setPlaceholderText("First Name");
        lastNameField.setPlaceholderText("Last Name");
        emailField.setPlaceholderText("Enter your email");
        passwordField.setPlaceholderText("Enter your password");
        passwordField.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        confirmPasswordField.setPlaceholderText("Confirm your passowrd");
        confirmPasswordField.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        signUpButton.setText("Sign Up");
        questionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        linkButton.setText("Sign in here");
        linkButton.addActionListener(e -> authFrame.showLogin());

        fullNamePanel.add(firstNameField);
        fullNamePanel.add(Box.createHorizontalStrut(15));
        fullNamePanel.add(lastNameField);

        questionPanel.add(new JLabel("Already have an account?"));
        questionPanel.add(linkButton);

        add(titleLabel);
        add(subTitleLabel);
        add(new JLabel("Full Name"));
        add(fullNamePanel);
        add(new JLabel("Email"));
        add(emailField);
        add(new JLabel("Password"));
        add(passwordField);
        add(new JLabel("Confirm Password"));
        add(confirmPasswordField);
        add(new JLabel()); //Empty label
        add(signUpButton);
        add(questionPanel);
    }
}
