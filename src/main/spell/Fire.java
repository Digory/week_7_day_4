package main.spell;

import main.enemy.Enemy;
import main.interfaces.ISpell;

public class Fire implements ISpell {


    @Override
    public void cast(Enemy enemy) {
        enemy.reduceHealthPoints(20);
    }
}
