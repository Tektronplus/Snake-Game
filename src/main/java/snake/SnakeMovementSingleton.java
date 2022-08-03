package snake;

public class SnakeMovementSingleton {
    private static SnakeMovement INSTANCE;

    private SnakeMovementSingleton(){}  //private constructor.

    //Methods
    public static SnakeMovement getInstance(){
        if (INSTANCE == null){ //if there is no instance available... create new one
            INSTANCE = new SnakeMovement();
        }

        return INSTANCE;
    }
}
