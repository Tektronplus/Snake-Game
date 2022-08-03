package snake;

import gamegrid.GameGrid;
import gamegrid.GameGridSingleton;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake extends Character {
    //VARIABLES
    List<Integer> bodySnake = new ArrayList<>(List.of(0));
    GameGrid gameGrid = GameGridSingleton.getInstance();

    boolean isThereFood;

    //CONSTRUCTOR
    public Snake(){
    }

    public void updateBodySnake(){
        bodySnake.add(0, position);
        isThereFood = gameGrid.getSquare(position).getBackground() == Color.RED; //check if there are food
        gameGrid.changeSquareColor(bodySnake.get(0), Color.BLACK);

        if(!isThereFood) {
            gameGrid.changeSquareColor(bodySnake.get(bodySnake.size() - 1), Color.WHITE);
            bodySnake.remove(bodySnake.size() - 1);
        }
    }
}
