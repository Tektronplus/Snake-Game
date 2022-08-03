package gamescore;

import food.GeneratorFoodSingleton;
import gamewindow.*;
import snake.SnakeMovementSingleton;

public class GameScore {
    //VARIABLES
    GameWindow gameWindow = GameWindowSingleton.getInstance();
    static int score = 0;

    //METHODS
    public void increaseScore(){
        score++;
        gameWindow.setTitle("SNAKE GAME - score: "+ score);
    }

    public void gameOver(){
        gameWindow.setTitle("GAME OVER - final score: "+ score);
        GeneratorFoodSingleton.getInstance().setWhileLoop(false);
        SnakeMovementSingleton.getInstance().setWhileloop(false);
    }
}
