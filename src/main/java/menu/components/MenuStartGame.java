package menu.components;

import game.MainGameController;
import menu.MenuGame;
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
            System.out.println(GameSettings.getColorSnake());
            System.out.println(GameSettings.getNumOfSquaresInSide());
            System.out.println(GameSettings.getSizeOfSquares());

            menuGame.setVisible(false);
            MainGameController mainGameController = new MainGameController();
        };

        btnStartGame.addActionListener(listener);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(btnStartGame, gbc);
    }
}
