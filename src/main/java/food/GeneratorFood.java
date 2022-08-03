package food;

import gamegrid.*;
import gamewindow.*;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GeneratorFood {
    //VARIABLES
    GameWindow gameWindow = GameWindowSingleton.getInstance();
    GameGrid gameGrid = GameGridSingleton.getInstance();

    Random random = new Random();
    Color colorRandomSquare;

    boolean whileLoop = true;
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
}
