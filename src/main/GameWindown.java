package main;

import javax.swing.*;

public class GameWindown {

    private JFrame jFrame;

    public GameWindown(GamePanel gamePanel){

        this.jFrame = new JFrame();

        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setVisible(true);
    }
}
