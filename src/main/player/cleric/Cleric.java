package main.player.cleric;

import main.interfaces.IHeal;
import main.player.Player;

public class Cleric extends Player {
    private IHeal healingThing;

    public Cleric(String name, IHeal healingThing) {
        super(name);
        this.healingThing = healingThing;
    }

    public void changeHealingThing(IHeal healingThing) {
        this.healingThing = healingThing;
    }

    public void heal(Player player){
        healingThing.heal(player);
    }
}
