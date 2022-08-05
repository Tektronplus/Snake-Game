package settings;

import java.awt.*;

public class GameSettings {
    private static int numOfSquaresInSide;
    private static int sizeOfSquares;
    private static Color colorSnake;

    public static int getNumOfSquaresInSide() {
        return numOfSquaresInSide;
    }

    public static void setNumOfSquaresInSide(int numOfSquaresInSide) {
        GameSettings.numOfSquaresInSide = numOfSquaresInSide;
    }

    public static int getSizeOfSquares() {
        return sizeOfSquares;
    }

    public static void setSizeOfSquares(int sizeOfSquares) {
        GameSettings.sizeOfSquares = sizeOfSquares;
    }

    public static Color getColorSnake() {
        return colorSnake;
    }

    public static void setColorSnake(Color colorSnake) {
        GameSettings.colorSnake = colorSnake;
    }
}
