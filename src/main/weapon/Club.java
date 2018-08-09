package main.weapon;

import main.enemy.Enemy;
import main.interfaces.IWeapon;

public class Club implements IWeapon {
    private int attackPower;

    public Club(){
        attackPower = 5;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.reduceHealthPoints(attackPower);
    }
}
