package main.weapon;

import main.enemy.Enemy;
import main.interfaces.IWeapon;

public class Sword implements IWeapon {
    private int attackPower;

    public Sword() {
        attackPower = 10;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.reduceHealthPoints(attackPower);
    }
}
