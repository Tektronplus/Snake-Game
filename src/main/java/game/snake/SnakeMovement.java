package game.snake;

import game.keyinput.KeyInput;

import java.util.concurrent.TimeUnit;

public class SnakeMovement {
    //VARIABLES
    Snake snake = new Snake();
    private boolean whileloop = true;

    //CONSTRUCTOR
    public SnakeMovement(){
        while(whileloop) {
            switch (KeyInput.getKeyPessed()){
                case 37 -> snake.goLeft();
                case 38 -> snake.goUp();
                case 39 -> snake.goRight();
                case 40 -> snake.goDown();
            }
            snake.movement();
            System.out.println(snake.position);

            //Delay Code
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (Exception ex) {
                System.out.println("Interrupted");
            }
        }

    }

    //SETTER
    public void setWhileloop(boolean whileloop) {
        this.whileloop = whileloop;
    }
}
