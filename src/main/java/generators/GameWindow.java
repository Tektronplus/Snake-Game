package generators;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    JPanel containerSquares;

    public GameWindow(int numSquaresInSide, int sizeOfSquares){
        super("SNAKE GAME"); //Title JFrame

        //JFrame initial settings
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        //Container Squares dimension
        int sideOfContainerSquares = numSquaresInSide * sizeOfSquares;
        Dimension dimensionContainerSquares = new Dimension(sideOfContainerSquares, sideOfContainerSquares);
        containerSquares = new JPanel();
        containerSquares.setPreferredSize(dimensionContainerSquares);

        //JFrame final settings
        add(containerSquares);
        pack();
    }
}
