package game.food;

public class GeneratorFoodSingleton {
    private static GeneratorFood INSTANCE;

    private GeneratorFoodSingleton(){}

    public static GeneratorFood getInstance(Thread thread){

        if (INSTANCE == null){
            INSTANCE = new GeneratorFood(thread);
        }

        return INSTANCE;
    }

    public static void reset(){
        INSTANCE = null;
    }
}
