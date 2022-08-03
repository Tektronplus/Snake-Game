package snake;

import gamegrid.GameGrid;
import gamegrid.GameGridSingleton;
import gamescore.GameScore;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake extends Character {
    //VARIABLES
    GameGrid gameGrid = GameGridSingleton.getInstance();
    GameScore gameScore = new GameScore();
    List<Integer> bodySnake = new ArrayList<>(List.of(0));


    boolean isThereFood;
    boolean isAlive;

    //CONSTRUCTOR
    public Snake(){
    }

    public void movement(){
        bodySnake.add(0, position);

        isThereFood = gameGrid.getSquare(position).getBackground() == Color.RED; //check if there are food
        isAlive = gameGrid.getSquare(position).getBackground() != Color.BLACK;

        gameGrid.changeSquareColor(bodySnake.get(0), Color.BLACK);

        if(!isAlive){gameScore.gameOver();}
        if(!isThereFood) {
            gameGrid.changeSquareColor(bodySnake.get(bodySnake.size() - 1), Color.WHITE);
            bodySnake.remove(bodySnake.size() - 1);
        } else {
            gameScore.increaseScore();
        }
    }
}
