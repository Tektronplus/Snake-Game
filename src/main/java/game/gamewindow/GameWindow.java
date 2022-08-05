package game.gamewindow;

import game.gamegrid.GameGridSingleton;
import game.keyinput.KeyInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {
    //VARIABLES
    private final int numSquaresInSide;

    //CONSTRUCTOR
    public GameWindow(int numSquaresInSide, int sizeOfSquares){
        super("SNAKE GAME"); //Title JFrame
        this.numSquaresInSide = numSquaresInSide;

        //JFrame initial settings
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        //Container of Squares
        int sideOfContainerSquares = numSquaresInSide * sizeOfSquares;
        Dimension dimensionContainerSquares = new Dimension(sideOfContainerSquares, sideOfContainerSquares);

        JPanel containerSquares = GameGridSingleton.getInstance(numSquaresInSide * numSquaresInSide).getContainerSquares();
        containerSquares.setPreferredSize(dimensionContainerSquares);
        containerSquares.setLayout(new GridLayout(numSquaresInSide, numSquaresInSide));

        //Key listener
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                int keyCode = e.getKeyCode();
                if(keyCode == 37 || keyCode == 38 || keyCode == 39 || keyCode == 40){
                    KeyInput.setKeyPessed(keyCode);
                }
            }
        });

        //JFrame final settings
        add(containerSquares);
        pack();
    }

    //GETTER
    public int getNumSquaresInSide() {
        return numSquaresInSide;
    }
}
