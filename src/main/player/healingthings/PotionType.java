package main.player.healingthings;

public enum PotionType {
    RED(100),
    BLUE(30),
    GREEN(1);

    private int healingHealth;

    PotionType(int healingHealth){
        this.healingHealth = healingHealth;
    }

    public int getHealingHealth() {
        return healingHealth;
    }
}
