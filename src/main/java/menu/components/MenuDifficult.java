package menu.components;

import settings.GameSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDifficult extends JPanel {
    JLabel titleLabel = new JLabel("Select Difficult");

    ButtonGroup buttonGroup = new ButtonGroup();
    JToggleButton btnEasy = new JToggleButton("EASY");
    JToggleButton btnMedium = new JToggleButton("MEDIUM");
    JToggleButton btnHard = new JToggleButton("HARD");

    GridBagConstraints gbc = new GridBagConstraints();

    public MenuDifficult(){
        setLayout(new GridBagLayout());

        //Setting JToggleButtons
        settingButtons();

        //Add to JPanel
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        add(btnEasy, gbc);
        gbc.gridx = 1;
        add(btnMedium, gbc);
        gbc.gridx = 2;
        add(btnHard, gbc);
    }
    public void settingButtons(){

        btnEasy.setActionCommand("1");
        btnMedium.setActionCommand("2");
        btnHard.setActionCommand("3");

        ActionListener listener = actionEvent -> {
            switch (actionEvent.getActionCommand()){
                case "1" -> gameEasy();
                case "2" -> gameMedium();
                case "3" -> gameHard();
            };
        };

        btnEasy.addActionListener(listener);
        btnMedium.addActionListener(listener);
        btnHard.addActionListener(listener);

        buttonGroup.add(btnEasy);
        buttonGroup.add(btnMedium);
        buttonGroup.add(btnHard);
    }

    public void gameEasy(){
        GameSettings.setNumOfSquaresInSide(10);
        GameSettings.setSizeOfSquares(50);
    }
    public void gameMedium(){
        GameSettings.setNumOfSquaresInSide(15);
        GameSettings.setSizeOfSquares(50);
    }
    public void gameHard(){
        GameSettings.setNumOfSquaresInSide(20);
        GameSettings.setSizeOfSquares(25);
    }
}
