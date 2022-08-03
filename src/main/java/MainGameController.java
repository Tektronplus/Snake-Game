import food.GeneratorFoodSingleton;
import gamewindow.*;

import snake.SnakeMovementSingleton;

public class MainGameController {
    final int numSquaresInSide = 10;
    final int sizeOfSquares = 50;

    public MainGameController(){
        GameWindow gameWindow = GameWindowSingleton.getInstance(numSquaresInSide, sizeOfSquares);

        gameWindow.setVisible(true);



        Thread thread01 = new Thread(){
            @Override
            public void run() {
                super.run();
                SnakeMovementSingleton.getInstance();
            }
        };
        Thread thread02 = new Thread(){
            @Override
            public void run() {
                super.run();
                GeneratorFoodSingleton.getInstance();
            }
        };

        thread01.start();
        thread02.start();
    }
}
