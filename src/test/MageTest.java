package test;

import main.enemy.Troll;
import main.furryfriends.Dragon;
import main.player.magicpeople.Warlock;
import main.spell.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {
    private Warlock warlock;
    private Fire fire;
    private Dragon dragon;
    private Troll troll;

    @Before
    public void before(){
        fire = new Fire();
        dragon = new Dragon();
        warlock = new Warlock("Jeremy", fire, dragon);
        troll = new Troll();
    }

    @Test
    public void spell__reduces_enemies_health(){
        warlock.castSpell(troll);
        assertEquals(30, troll.getHealthPoints());
    }

    @Test
    public void defendWithCreature__reduces_enemies_health(){
        warlock.defendWithCreature(troll);
        assertEquals(0, troll.getHealthPoints());
    }
}
