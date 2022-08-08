package menu.components;

import javax.swing.*;
import java.awt.*;

public class MenuTitle extends JPanel {
    private static String title = "SNAKE GAME";
    JLabel titleLabel = new JLabel(title);

    GridBagConstraints gbc = new GridBagConstraints();
    public MenuTitle(){
        setLayout(new GridBagLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(titleLabel, gbc);
    }

    public static void setTitle(String title) {
        MenuTitle.title = title;
    }
}
