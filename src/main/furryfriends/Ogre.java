package main.furryfriends;

import main.enemy.Enemy;
import main.interfaces.IDefend;

public class Ogre implements IDefend {


    @Override
    public void defend(Enemy enemy) {
        enemy.reduceHealthPoints(12);
    }
}
