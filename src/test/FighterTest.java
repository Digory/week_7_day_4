package test;

import main.enemy.Orc;
import main.player.fighter.Dwarf;
import main.player.fighter.Knight;
import main.weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    private Dwarf dwarf;
    private Sword sword;
    private Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        dwarf = new Dwarf("Mike Kristoferson", sword);
        orc = new Orc();
    }

    @Test
    public void attackEnemy__enemies_health_reduces(){
        dwarf.attackEnemy(orc);
        assertEquals(90, orc.getHealthPoints());
    }

    @Test
    public void attackEnemy__returns_correct_string(){
        String actual = dwarf.attackEnemy(orc);
        assertEquals("You're not Snow White!", actual);
    }
}
