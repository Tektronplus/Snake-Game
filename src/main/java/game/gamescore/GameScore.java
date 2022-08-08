package game.gamescore;

import game.MainGameControllerSingleton;
import game.gamewindow.GameWindow;
import game.gamewindow.GameWindowSingleton;

import menu.MenuGame;
import menu.components.MenuTitle;
import settings.GameSettings;

public class GameScore {
    //VARIABLES
    GameWindow gameWindow = GameWindowSingleton.getInstance(GameSettings.getNumOfSquaresInSide(), GameSettings.getSizeOfSquares());
    static int score = 0;

    //METHODS
    public void increaseScore(){
        score++;
        gameWindow.setTitle("SNAKE GAME - score: "+ score);
    }

    public void gameOver(){
        MenuTitle.setTitle("SCORE: "+ score);
        MainGameControllerSingleton.getInstance().interruptThreads();


        MainGameControllerSingleton.reset();

        GameWindowSingleton.getInstance(GameSettings.getNumOfSquaresInSide(), GameSettings.getSizeOfSquares()).setVisible(false);
        new MenuGame();
    }
    public static void zeroedScore(){
        score = 0;
    }
}
