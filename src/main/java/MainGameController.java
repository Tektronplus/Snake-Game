import gamewindow.GameWindow;
import gamewindow.GameWindowSingleton;
import gamegrid.GameGrid;
import gamegrid.GameGridSingleton;

import java.awt.*;

public class MainGameController {
    final int numSquaresInSide = 15;
    final int sizeOfSquares = 50;

    public MainGameController(){
        GameWindow gameWindow = GameWindowSingleton.getInstance(numSquaresInSide, sizeOfSquares);

        gameWindow.setVisible(true);

        GameGrid gameGrid = GameGridSingleton.getInstance();
        gameGrid.changeSquareColor(0, Color.CYAN);
        System.out.println(gameGrid);
    }
}
