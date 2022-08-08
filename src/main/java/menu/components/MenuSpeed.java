package menu.components;

import settings.GameSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuSpeed extends JPanel {
    JLabel titleLabel = new JLabel("Select Speed Game");

    ButtonGroup buttonGroup = new ButtonGroup();
    JToggleButton btnSlow = new JToggleButton("SLOW");
    JToggleButton btnNormal = new JToggleButton("NORMAL");
    JToggleButton btnFast = new JToggleButton("FAST");

    GridBagConstraints gbc = new GridBagConstraints();

    public MenuSpeed(){
        setLayout(new GridBagLayout());

        //Setting Buttons
        settingButtons();

        //add titleLabel
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        add(btnSlow, gbc);
        gbc.gridx = 1;
        add(btnNormal, gbc);
        gbc.gridx = 2;
        add(btnFast, gbc);
    }
    public void settingButtons(){

        btnSlow.setActionCommand("1");
        btnNormal.setActionCommand("2");
        btnFast.setActionCommand("3");

        ActionListener listener = actionEvent -> {
            switch (actionEvent.getActionCommand()){
                case "1" -> GameSettings.setSpeed(300);
                case "2" -> GameSettings.setSpeed(250);
                case "3" -> GameSettings.setSpeed(200);
            }
        };

        btnSlow.addActionListener(listener);
        btnNormal.addActionListener(listener);
        btnFast.addActionListener(listener);

        buttonGroup.add(btnSlow);
        buttonGroup.add(btnNormal);
        buttonGroup.add(btnFast);
    }
}
