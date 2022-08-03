package gamegrid;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameGrid {
    //VARIABLES
    private final JPanel containerSquares = new JPanel();
    List<JPanel> listSquares = new ArrayList<>();

    //CONSTRUCTOR
    public GameGrid(int totSquares){
        //Adding JPanels to ArrayList
        for(int i = 0; i < totSquares; i++){
            listSquares.add(new JPanel());
        }
        //Adding JPanels of List to Container
        for(JPanel jPanel : listSquares){
            jPanel.setBackground(Color.BLACK);
            containerSquares.add(jPanel);
        }
    }


    //METHODS
    public void changeSquareColor(int index, Color color){
        listSquares.get(index).setBackground(color);
    }

    //GETTER && SETTER
    public JPanel getContainerSquares() {
        return containerSquares;
    }
}