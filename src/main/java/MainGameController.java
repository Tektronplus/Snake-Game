import gamewindow.*;

import snake.SnakeMovement;

public class MainGameController {
    final int numSquaresInSide = 10;
    final int sizeOfSquares = 50;

    public MainGameController(){
        GameWindow gameWindow = GameWindowSingleton.getInstance(numSquaresInSide, sizeOfSquares);

        gameWindow.setVisible(true);

        new SnakeMovement();

    }
}
