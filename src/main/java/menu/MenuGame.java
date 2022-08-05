package menu;

import menu.components.MenuColorSnake;
import menu.components.MenuDifficult;
import menu.components.MenuStartGame;
import menu.components.MenuTitle;

import javax.swing.*;
import java.awt.*;

public class MenuGame extends JFrame {
    //Panels of Menu
    JPanel panelTitleGame = new MenuTitle();
    JPanel panelSetDifficult = new MenuDifficult();
    JPanel panelSetColourSnake = new MenuColorSnake();
    JPanel panelStartGame = new MenuStartGame(this);

    public MenuGame(){
        super("SNAKE GAME");

        //Settings of JFrame
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1 ));
        setSize(400, 400);
        setResizable(false);

        //Adding components of menu
        add(panelTitleGame);
        add(panelSetDifficult);
        add(panelSetColourSnake);
        add(panelStartGame);

        setVisible(true);
    }
}

//panelTitleGame.setBackground(Color.RED);
//panelSetDifficult.setBackground(Color.BLUE);
//panelSetColourSnake.setBackground(Color.GREEN);
//panelStartGame.setBackground(Color.RED);