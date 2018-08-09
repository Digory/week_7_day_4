package main.weapon;

import main.enemy.Enemy;
import main.interfaces.IWeapon;

public class Axe implements IWeapon {
    private int attackPower;

    public Axe(){
        attackPower = 15;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.reduceHealthPoints(attackPower);
    }
}
