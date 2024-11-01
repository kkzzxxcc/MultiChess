package main;

import main.ui.homeUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Launch the chess application
        SwingUtilities.invokeLater(() -> {
            new homeUI();
        });
    }
}