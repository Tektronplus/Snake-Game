package gamewindow;

import gamegrid.GameGridSingleton;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    //VARIABLES
    private JPanel containerSquares;

    //CONSTRUCTOR
    public GameWindow(int numSquaresInSide, int sizeOfSquares){
        super("SNAKE GAME"); //Title JFrame

        //JFrame initial settings
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        //Container Squares dimension
        int sideOfContainerSquares = numSquaresInSide * sizeOfSquares;
        Dimension dimensionContainerSquares = new Dimension(sideOfContainerSquares, sideOfContainerSquares);
        containerSquares = GameGridSingleton.getInstance(numSquaresInSide*numSquaresInSide).getContainerSquares();
        containerSquares.setPreferredSize(dimensionContainerSquares);
        containerSquares.setLayout(new GridLayout(numSquaresInSide, numSquaresInSide));

        //JFrame final settings
        add(containerSquares);
        pack();
    }

    //GETTER && SETTER
    public JPanel getContainerSquares() {
        return containerSquares;
    }
    public void setContainerSquares(JPanel containerSquares) {
        this.containerSquares = containerSquares;
    }
}
