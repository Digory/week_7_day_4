package test;

import main.enemy.Orc;
import main.player.fighter.Knight;
import main.weapon.Sword;
import org.junit.Test;

public class FighterTest {
    private Knight knight;
    private Sword sword;
    private Orc orc;

    @Test
    public void printWhatTheKnightSays(){
        sword = new Sword();
        knight = new Knight("Mike Kristoferson", sword);
        orc = new Orc();

        System.out.println(knight.attackEnemy(orc));
        System.out.println(knight.attackEnemy(orc));
        System.out.println(knight.attackEnemy(orc));
        System.out.println(knight.attackEnemy(orc));
    }
}
