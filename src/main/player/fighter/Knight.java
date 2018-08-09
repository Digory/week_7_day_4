package main.player.fighter;

import main.enemy.Enemy;
import main.interfaces.IWeapon;

import java.util.Random;

public class Knight extends Fighter{

    public Knight(String name, IWeapon weapon) {
        super(name, weapon);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if(randomNumber == 0){
            return "Oh darn, I missed.";
        }
        else{
            weapon.attack(enemy);
            weapon.attack(enemy);
            return "Haha. Got you twice.";
        }

    }
}
