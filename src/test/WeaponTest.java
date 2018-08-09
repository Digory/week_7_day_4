package test;

import main.enemy.Orc;
import main.weapon.Axe;
import main.weapon.Club;
import main.weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WeaponTest {
    private Orc orc;
    private Sword sword;
    private Axe axe;
    private Club club;

    @Before
    public void before(){
        orc = new Orc();
        sword = new Sword();
        axe = new Axe();
        club = new Club();
    }

    @Test
    public void attackReducesEnemyHealth__single_weapon(){
        sword.attack(orc);
        int actual = orc.getHealthPoints();
        assertEquals(90, actual);
    }

    @Test
    public void attackReducesEnemyHealth__multiple_weapons(){
        sword.attack(orc);
        axe.attack(orc);
        club.attack(orc);
        int actual = orc.getHealthPoints();
        assertEquals(70, actual);
    }
}
