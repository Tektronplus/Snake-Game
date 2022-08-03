import food.GeneratorFood;
import gamewindow.*;

import snake.SnakeMovement;

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
                new SnakeMovement();
            }
        };
        Thread thread02 = new Thread(){
            @Override
            public void run() {
                super.run();
                new GeneratorFood();
            }
        };

        thread01.start();
        thread02.start();
    }
}
