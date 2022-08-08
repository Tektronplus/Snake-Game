package game.keyinput;

public class KeyInput {
    //VARIABLES
    private static int keyPessed;

    public KeyInput(){}

    //GETTER && SETTER
    public static int getKeyPessed() {
        return keyPessed;
    }

    public static void setKeyPessed(int keyPessed) {
        if (Math.abs(KeyInput.keyPessed - keyPessed) != 2) {
            KeyInput.keyPessed = keyPessed;
        }
    }


}
