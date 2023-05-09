package main;

import input.KeyboardInputs;
import input.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 0;
    private int yDelta = 0;

    public GamePanel(){
        this.mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value){
        this.xDelta += value;
    }

    public void changeYDelta(int value){
        this.yDelta += value;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(100 + xDelta, 100 + yDelta,200,50);
    }
}
