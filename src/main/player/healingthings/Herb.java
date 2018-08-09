package main.player.healingthings;

import main.interfaces.IHeal;
import main.player.Player;

public class Herb implements IHeal {


    @Override
    public void heal(Player player) {
        player.addHealthPoints(30);
    }
}
