package main.player.fighter;

import main.enemy.Enemy;
import main.interfaces.IWeapon;

public class Dwarf extends Fighter{

    public Dwarf(String name, IWeapon weapon) {
        super(name, weapon);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        weapon.attack(enemy);
        return "You're not Snow White!";
    }
}
