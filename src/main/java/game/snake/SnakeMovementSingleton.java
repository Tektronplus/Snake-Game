package game.snake;

public class SnakeMovementSingleton {
    private static SnakeMovement INSTANCE;

    private SnakeMovementSingleton(){}

    public static SnakeMovement getInstance(Thread thread){

        if (INSTANCE == null){
            INSTANCE = new SnakeMovement(thread);
        }
        return INSTANCE;
    }

    public static void reset(){
        INSTANCE = null;
    }
}
