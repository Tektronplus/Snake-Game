package game;

import game.food.GeneratorFoodSingleton;
import game.gamewindow.GameWindow;
import game.gamewindow.GameWindowSingleton;

import game.snake.SnakeMovementSingleton;
import settings.GameSettings;

public class MainGameController {
    final int numSquaresInSide = GameSettings.getNumOfSquaresInSide();
    final int sizeOfSquares = GameSettings.getSizeOfSquares();

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
