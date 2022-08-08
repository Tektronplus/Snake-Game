package menu.components;

import settings.GameSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuColorSnake extends JPanel{
    JLabel titleLabel = new JLabel("Select Color Snake");

    ButtonGroup buttonGroup = new ButtonGroup();
    JToggleButton btnBlack = new JToggleButton("Black");
    JToggleButton btnBlue = new JToggleButton("Blue");
    JToggleButton btnGreen = new JToggleButton("Green");

    GridBagConstraints gbc = new GridBagConstraints();

    public MenuColorSnake(){
        setLayout(new GridBagLayout());

        //Setting Buttons
        settingButtons();

        //add titleLabel
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        add(btnBlack, gbc);
        gbc.gridx = 1;
        add(btnBlue, gbc);
        gbc.gridx = 2;
        add(btnGreen, gbc);
    }
    public void settingButtons(){

        btnBlack.setActionCommand("1");
        btnBlue.setActionCommand("2");
        btnGreen.setActionCommand("3");

        ActionListener listener = actionEvent -> {
            switch (actionEvent.getActionCommand()){
                case "1" -> GameSettings.setColorSnake(Color.BLACK);
                case "2" -> GameSettings.setColorSnake(Color.BLUE);
                case "3" -> GameSettings.setColorSnake(Color.GREEN);
            }
        };

        btnBlack.addActionListener(listener);
        btnBlue.addActionListener(listener);
        btnGreen.addActionListener(listener);

        buttonGroup.add(btnBlack);
        buttonGroup.add(btnBlue);
        buttonGroup.add(btnGreen);
    }
}
