package food;

public class GeneratorFoodSingleton {
    private static GeneratorFood INSTANCE;

    private GeneratorFoodSingleton(){}  //private constructor.

    //Methods
    public static GeneratorFood getInstance(){
        if (INSTANCE == null){ //if there is no instance available... create new one
            INSTANCE = new GeneratorFood();
        }

        return INSTANCE;
    }
}
