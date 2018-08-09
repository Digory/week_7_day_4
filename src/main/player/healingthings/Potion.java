package main.player.healingthings;

import main.interfaces.IHeal;
import main.player.Player;

public class Potion implements IHeal {

    private PotionType type;

    public Potion(PotionType type) {
        this.type = type;
    }

    @Override
    public void heal(Player player) {
        player.addHealthPoints(type.getHealingHealth());
    }
}
