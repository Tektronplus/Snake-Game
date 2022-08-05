package game.gamewindow;

public class GameWindowSingleton {

    private static GameWindow INSTANCE;

    private GameWindowSingleton(){}  //private constructor.

    //Methods
    public static GameWindow getInstance(int numSquaresInSide, int sizeOfSquares){
        if (INSTANCE == null){ //if there is no instance available... create new one
            INSTANCE = new GameWindow(numSquaresInSide, sizeOfSquares);
        }

        return INSTANCE;
    }
    public static GameWindow getInstance(){
        return INSTANCE;
    }
}