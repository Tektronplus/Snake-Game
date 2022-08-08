package menu.components;

import settings.GameSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuSize extends JPanel {
    JLabel titleLabel = new JLabel("Select Size Game");

    ButtonGroup buttonGroup = new ButtonGroup();
    JToggleButton btnSmall = new JToggleButton("SMALL");
    JToggleButton btnNormal = new JToggleButton("NORMAL");
    JToggleButton btnBig = new JToggleButton("BIG");

    GridBagConstraints gbc = new GridBagConstraints();

    public MenuSize(){
        setLayout(new GridBagLayout());

        //Setting JToggleButtons
        settingButtons();

        //Add to JPanel
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        add(btnSmall, gbc);
        gbc.gridx = 1;
        add(btnNormal, gbc);
        gbc.gridx = 2;
        add(btnBig, gbc);
    }
    public void settingButtons(){

        btnSmall.setActionCommand("1");
        btnNormal.setActionCommand("2");
        btnBig.setActionCommand("3");

        ActionListener listener = actionEvent -> {
            switch (actionEvent.getActionCommand()){
                case "1" -> gameSmall();
                case "2" -> gameNormal();
                case "3" -> gameBig();
            }
        };

        btnSmall.addActionListener(listener);
        btnNormal.addActionListener(listener);
        btnBig.addActionListener(listener);

        buttonGroup.add(btnSmall);
        buttonGroup.add(btnNormal);
        buttonGroup.add(btnBig);
    }

    public void gameSmall(){
        GameSettings.setNumOfSquaresInSide(10);
        GameSettings.setSizeOfSquares(50);
    }
    public void gameNormal(){
        GameSettings.setNumOfSquaresInSide(15);
        GameSettings.setSizeOfSquares(50);
    }
    public void gameBig(){
        GameSettings.setNumOfSquaresInSide(20);
        GameSettings.setSizeOfSquares(25);
    }
}
