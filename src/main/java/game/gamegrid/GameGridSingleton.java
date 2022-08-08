package game.gamegrid;

public class GameGridSingleton {
    private static GameGrid INSTANCE;

    private GameGridSingleton(){}

    public static GameGrid getInstance(int numSquaresInSide){
        if (INSTANCE == null){

            INSTANCE = new GameGrid(numSquaresInSide);
        }

        return INSTANCE;
    }
    public static GameGrid getInstance(){
        return INSTANCE;
    }

    public static void reset(){
        INSTANCE = null;
    }
}
