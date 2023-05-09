package main;

public class Game {

    private GameWindown gameWindown;

    private  GamePanel gamePanel;

    public Game(){
        this.gamePanel = new GamePanel();
        this.gameWindown = new GameWindown(gamePanel);

    }
}
