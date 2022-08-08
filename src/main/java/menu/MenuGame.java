package menu;

import menu.components.*;

import javax.swing.*;
import java.awt.*;

public class MenuGame extends JFrame {
    //Panels of Menu
    JPanel panelTitleGame = new MenuTitle();
    JPanel panelSizeGame = new MenuSize();
    JPanel panelSpeedGame = new MenuSpeed();
    JPanel panelSetColourSnake = new MenuColorSnake();
    JPanel panelStartGame = new MenuStartGame(this);

    public MenuGame(){
        super("SNAKE GAME");

        //Settings of JFrame
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,1 ));
        setSize(400, 400);
        setResizable(false);

        //Adding components of menu
        add(panelTitleGame);
        add(panelSizeGame);
        add(panelSpeedGame);
        add(panelSetColourSnake);
        add(panelStartGame);

        setVisible(true);
    }
}

//panelTitleGame.setBackground(Color.RED);
//panelSetDifficult.setBackground(Color.BLUE);
//panelSetColourSnake.setBackground(Color.GREEN);
//panelStartGame.setBackground(Color.RED);