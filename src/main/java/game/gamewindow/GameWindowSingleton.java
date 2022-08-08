package game.gamewindow;

public class GameWindowSingleton {

    private static GameWindow INSTANCE;

    private GameWindowSingleton(){}

    //Methods
    public static GameWindow getInstance(int numSquaresInSide, int sizeOfSquares){
        if (INSTANCE == null){
            INSTANCE = new GameWindow(numSquaresInSide, sizeOfSquares);
        }

        return INSTANCE;
    }

    public static void reset(){
        INSTANCE = null;
    }
}