package menu.error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ErrorFrame extends JFrame {

    //Components of JFrame
    JLabel errorMessage = new JLabel("Select all fields");
    JButton okButton = new JButton("OK");

    GridBagConstraints gbc = new GridBagConstraints(); //Constrains for GridLayout

    public ErrorFrame(){
        super("ERROR");

        //Settings of JFrame
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE); //HIDE_ON_CLOSE to close only one JFrame
        setLayout(new GridBagLayout());
        setSize(200, 100);
        setResizable(false);

        //Functions of button
        settingButton();

        //Adding components
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(errorMessage, gbc);
        gbc.gridy = 1;
        add(okButton, gbc);

        setVisible(true);
    }

     public void settingButton(){
         ActionListener listener = actionEvent -> dispose(); //dispose() to close JFrame after click
         okButton.addActionListener(listener);
     }
}
