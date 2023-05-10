package main;

public class Game implements Runnable{

    private GameWindown gameWindown;
    private  GamePanel gamePanel;
    private Thread gameThread;
    private final int FPS_SET = 120;

    public Game(){
        this.gamePanel = new GamePanel();
        this.gameWindown = new GameWindown(gamePanel);
        gamePanel.requestFocus();
    }

    @Override
    public void run() {

        double timePerFrame = 1000000000.0 / FPS_SET;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();

        while(true){
            now = System.nanoTime();
            if(now - lastFrame >= timePerFrame){
                gamePanel.repaint();
                lastFrame = now;
            }
        }
    }

    private void startGameLoop(){
        
    }
}
