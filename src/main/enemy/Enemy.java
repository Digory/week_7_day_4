package main.enemy;

public abstract class Enemy {

    private int healthPoints;
    private boolean isAlive;

    public boolean isAlive() {
        return isAlive;
    }

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
        isAlive = true;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void reduceHealthPoints(int points) {
        if(healthPoints - points <= 0){
            healthPoints = 0;
            isAlive = false;
        }
        else{
            healthPoints -= points;
        }
    }
}
