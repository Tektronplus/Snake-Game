package game.snake;

import game.keyinput.KeyInput;
import settings.GameSettings;

import java.util.concurrent.TimeUnit;

public class SnakeMovement {
    //VARIABLES
    Snake snake = new Snake();
    int gameSpeed = GameSettings.getSpeed();

    //CONSTRUCTOR
    public SnakeMovement(Thread thread){
        while(!thread.isInterrupted()) {
            switch (KeyInput.getKeyPessed()){
                case 37 -> snake.goLeft();
                case 38 -> snake.goUp();
                case 39 -> snake.goRight();
                case 40 -> snake.goDown();
            }
            snake.movement();
            System.out.println("SnakeMovement: "+ snake.position);

            //Delay Code
            try {
                TimeUnit.MILLISECONDS.sleep(gameSpeed);
            } catch (Exception ex) {
                System.out.println("Interrupted - SnakeMovement");
                break;
            }
        }

    }
}
