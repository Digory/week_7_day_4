package main.player.fighter;

import main.enemy.Enemy;
import main.interfaces.IWeapon;
import main.player.Player;

public abstract class Fighter extends Player {
    protected IWeapon weapon;

    public Fighter(String name, IWeapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public void changeWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public abstract String attackEnemy(Enemy enemy);
}
