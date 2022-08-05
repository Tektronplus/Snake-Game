package game.food;

import game.gamegrid.GameGrid;
import game.gamegrid.GameGridSingleton;
import game.gamewindow.GameWindow;
import game.gamewindow.GameWindowSingleton;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GeneratorFood {
    //VARIABLES
    GameWindow gameWindow = GameWindowSingleton.getInstance();
    GameGrid gameGrid = GameGridSingleton.getInstance();

    Random random = new Random();
    Color colorRandomSquare;

    private boolean whileLoop = true;
    int randomIndex;
    int randomTime;

    //CONSTRUCTOR
    public GeneratorFood(){
        while(whileLoop){
            do {
                randomIndex = random.nextInt(gameWindow.getNumSquaresInSide() * gameWindow.getNumSquaresInSide());
                randomTime = random.nextInt(10);

                colorRandomSquare = gameGrid.getSquare(randomIndex).getBackground();
            } while (colorRandomSquare != Color.WHITE);

            gameGrid.changeSquareColor(randomIndex, Color.RED);

            //Delay
            try {
                TimeUnit.SECONDS.sleep(randomTime + 4);
            } catch (Exception ex) {
                System.out.println("Interrupted");
            }
        }
    }

    //SETTER
    public void setWhileLoop(boolean whileLoop) {
        this.whileLoop = whileLoop;
    }
}
