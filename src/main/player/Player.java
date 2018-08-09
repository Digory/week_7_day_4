package main.player;

public abstract class Player {
    protected String name;
    protected int healthPoints;

    public Player(String name) {
        this.name = name;
        healthPoints = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
