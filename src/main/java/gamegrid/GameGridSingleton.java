package gamegrid;

public class GameGridSingleton {
    private static GameGrid INSTANCE;

    private GameGridSingleton(){}  //private constructor.

    //Methods
    public static GameGrid getInstance(int numSquaresInSide){
        if (INSTANCE == null){ //if there is no instance available... create new one
            INSTANCE = new GameGrid(numSquaresInSide);
        }

        return INSTANCE;
    }
    public static GameGrid getInstance(){
        return INSTANCE;
    }
}
