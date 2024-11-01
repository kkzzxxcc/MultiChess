package main.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homeUI extends JFrame {

    private JPanel bannerPanel;
    private JLabel bannerLabel;

    private JPanel buttonsPanel;
    private JPanel loginButtonPanel;
    private JPanel signUpButtonPanel;
    private JButton loginButton;
    private JButton signUpButton;

    public homeUI() {
        super("MultiChess - Client");
        loadInterface();
    }

    private void loadInterface() {
        initializeBannerPanel();
        initializeButtonsPanel();

        this.setLayout(new BorderLayout());
        this.add(bannerPanel, BorderLayout.NORTH);
        this.add(buttonsPanel, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initializeBannerPanel() {
        bannerLabel = new JLabel();
        bannerLabel.setIcon(new ImageIcon(getClass().getResource("/res/homeUI.jpg")));
        bannerPanel = new JPanel();
        bannerPanel.add(bannerLabel);
        bannerPanel.setPreferredSize(new Dimension(800, 400));
        bannerPanel.setBackground(Color.LIGHT_GRAY);
    }

    private void initializeButtonsPanel() {
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 서버 로그인 로직 추가 예정
                setVisible(false);
            }
        });

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 서버 회원가입 로직 추가 예정
                setVisible(false);
            }
        });

        loginButtonPanel = new JPanel(new GridLayout(1, 1));
        loginButtonPanel.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 25));
        loginButtonPanel.add(loginButton);

        signUpButtonPanel = new JPanel(new GridLayout(1, 1));
        signUpButtonPanel.setBorder(BorderFactory.createEmptyBorder(40, 25, 40, 50));
        signUpButtonPanel.add(signUpButton);

        buttonsPanel = new JPanel(new GridLayout(1, 2));
        buttonsPanel.setPreferredSize(new Dimension(600, 150));
        buttonsPanel.add(loginButtonPanel);
        buttonsPanel.add(signUpButtonPanel);


    }
}