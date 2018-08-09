package main.player.fighter;

import main.enemy.Enemy;
import main.interfaces.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(String name, IWeapon weapon) {
        super(name, weapon);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        weapon.attack(enemy);
        return "RAAAAAAAA. THE CITY BELONGS TO THE BARBARIANS!!!!!!";
    }
}
