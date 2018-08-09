package main.player.magicpeople;

import main.enemy.Enemy;
import main.interfaces.IDefend;
import main.interfaces.ISpell;
import main.player.Player;

public abstract class Mage extends Player{

    private ISpell spell;
    private IDefend creature;

    public Mage(String name, ISpell spell, IDefend creature) {
        super(name);
        this.spell = spell;
        this.creature = creature;
    }

    public void castSpell(Enemy enemy){
        spell.cast(enemy);
    }

    public void defendWithCreature(Enemy enemy){
        creature.defend(enemy);
    }

    public IDefend getCreature() {
        return creature;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void changeCreature(IDefend creature){
        this.creature = creature;
    }

    public void changeSpell(ISpell spell){
        this.spell = spell;
    }
}
