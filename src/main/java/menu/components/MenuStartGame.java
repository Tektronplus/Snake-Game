package menu.components;

import game.MainGameControllerSingleton;
import menu.MenuGame;
import menu.error.ErrorFrame;
import settings.GameSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuStartGame extends JPanel{
    JButton btnStartGame = new JButton("START GAME");
    GridBagConstraints gbc = new GridBagConstraints();


    public MenuStartGame(MenuGame menuGame){
        setLayout(new GridBagLayout());

        ActionListener listener = actionEvent -> {
            boolean incompleteFields = checkSelectdFields();

            if(!incompleteFields) {
                menuGame.dispose();
                MainGameControllerSingleton.getInstance();
            }
        };

        btnStartGame.addActionListener(listener);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(btnStartGame, gbc);
    }

    public boolean checkSelectdFields(){
        Color colorSnake = GameSettings.getColorSnake();
        int numOfSquareInSide = GameSettings.getNumOfSquaresInSide();
        int sizeOfSquares = GameSettings.getSizeOfSquares();
        int speed = GameSettings.getSpeed();

        boolean check = colorSnake == null || numOfSquareInSide == 0 || sizeOfSquares == 0 || speed == 0;

        if(check){
            new ErrorFrame();
        }
        return check;
    }
}
