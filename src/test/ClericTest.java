package test;

import main.player.cleric.Cleric;
import main.player.fighter.Knight;
import main.player.healingthings.Potion;
import main.player.healingthings.PotionType;
import main.weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    private Cleric cleric;
    private Potion potion;
    private Knight knight;
    private Axe axe;

    @Before
    public void before(){
        potion = new Potion(PotionType.RED);
        cleric = new Cleric("Barbara", potion);
        axe = new Axe();
        knight = new Knight("Jim", axe);

    }

    @Test
    public void heal__increases_players_health(){
        cleric.heal(knight);
        assertEquals(200, knight.getHealthPoints());
    }
}
