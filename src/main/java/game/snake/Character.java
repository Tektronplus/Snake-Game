package game.snake;

import game.gamewindow.GameWindowSingleton;

public abstract class Character implements CharacterMovement {
    int position = 0;
    int numSquaresInSide = GameWindowSingleton.getInstance().getNumSquaresInSide();

    int lastIndexInLine;
    int firstIndexInLine;

    public Character(){}

    @Override
    public void goUp(){
        verticalMovement();
        position = position == firstIndexInLine ? lastIndexInLine : position - numSquaresInSide;
    }

    @Override
    public void goDown(){
        verticalMovement();
        position = position == lastIndexInLine ? firstIndexInLine : position + numSquaresInSide;
    }

    @Override
    public void goRight(){
        horizontalMovement();
        position = position == lastIndexInLine ? firstIndexInLine : position + 1;
    }

    @Override
    public void goLeft(){
        horizontalMovement();
        position = position == firstIndexInLine ? lastIndexInLine : position - 1;
    }

    public void horizontalMovement(){
        int numRowPosition = position / numSquaresInSide;
        firstIndexInLine = numRowPosition * numSquaresInSide;
        lastIndexInLine = firstIndexInLine + numSquaresInSide - 1;
    }

    public void verticalMovement(){
        int numColPosition = position % numSquaresInSide;
        firstIndexInLine = numColPosition;
        lastIndexInLine = numColPosition + (numSquaresInSide - 1) * numSquaresInSide;
    }
}

