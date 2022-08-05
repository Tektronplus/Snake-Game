package menu.components;

import javax.swing.*;
import java.awt.*;

public class MenuTitle extends JPanel {
    JLabel titleLabel = new JLabel("SNAKE GAME");

    GridBagConstraints gbc = new GridBagConstraints();
    public MenuTitle(){
        setLayout(new GridBagLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(titleLabel, gbc);
    }
}
