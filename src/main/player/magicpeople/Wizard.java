package main.player.magicpeople;

import main.enemy.Enemy;
import main.interfaces.IDefend;
import main.interfaces.ISpell;

public class Wizard extends Mage{


    public Wizard(String name, ISpell spell, IDefend creature) {
        super(name, spell, creature);
    }
}
