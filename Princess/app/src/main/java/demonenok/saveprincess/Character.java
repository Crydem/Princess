package demonenok.saveprincess;

public class Character {
    private int x, y;
    private int speed;
    private boolean isMovingUp, isMovingDown, isMovingLeft, isMovingRight; // флаги направления движения персонажа

    public Character(int x, int y){
        this.x = x; this.y = y;
    }

    public void moveUp() {
        isMovingUp = true;
        y += speed;
    }

}
