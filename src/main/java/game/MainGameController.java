package game;

import game.food.GeneratorFoodSingleton;
import game.gamegrid.GameGridSingleton;
import game.gamescore.GameScore;
import game.gamewindow.GameWindow;
import game.gamewindow.GameWindowSingleton;

import game.snake.SnakeMovementSingleton;
import settings.GameSettings;

public class MainGameController {
    final int numSquaresInSide = GameSettings.getNumOfSquaresInSide();
    final int sizeOfSquares = GameSettings.getSizeOfSquares();

    Thread thread01;
    Thread thread02;

    public MainGameController(){
        //Reset all Singletons
        GameScore.zeroedScore();
        GeneratorFoodSingleton.reset();
        SnakeMovementSingleton.reset();
        GameGridSingleton.reset();
        GameWindowSingleton.reset();


        GameWindow gameWindow = GameWindowSingleton.getInstance(numSquaresInSide, sizeOfSquares);
        gameWindow.setVisible(true);


        thread01 = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("Thread 01");
                SnakeMovementSingleton.getInstance(thread01);
            }
        };
        thread02 = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("Thread 02");
                GeneratorFoodSingleton.getInstance(thread02);
            }
        };

        thread01.start();
        thread02.start();
    }

    public void interruptThreads(){
        thread01.interrupt();
        thread02.interrupt();
    }
}
