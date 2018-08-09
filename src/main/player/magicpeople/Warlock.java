package main.player.magicpeople;

import main.interfaces.IDefend;
import main.interfaces.ISpell;

public class Warlock extends Mage{

    public Warlock(String name, ISpell spell, IDefend creature) {
        super(name, spell, creature);
    }
}
