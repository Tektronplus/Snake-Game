package game;

public class MainGameControllerSingleton {
    private static MainGameController INSTANCE;

    private MainGameControllerSingleton(){}

    //Methods
    public static MainGameController getInstance(){
        if (INSTANCE == null){
            INSTANCE = new MainGameController();
        }

        return INSTANCE;
    }

    public static void reset(){
        INSTANCE = null;
    }
}
