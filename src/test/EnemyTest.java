package test;

import main.enemy.Orc;
import main.enemy.Troll;
import main.furryfriends.Dragon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnemyTest {
    private Orc orc;
    private Troll troll;
    private Dragon dragon;

    @Before
    public void before(){
        orc = new Orc();
        troll = new Troll();
        dragon = new Dragon();
    }

    @Test
    public void hasFullHealthOnCreation__orc(){
        int actual = orc.getHealthPoints();
        assertEquals(100, actual);
    }

    @Test
    public void hasFullHealthOnCreation__troll(){
        int actual = troll.getHealthPoints();
        assertEquals(50, actual);
    }

    @Test
    public void isAliveOnCreation(){
        boolean actual = orc.isAlive();
        assertEquals(true, actual);
    }

    @Test
    public void isDeadWhenHealthIsZero(){
        dragon.defend(troll);
        boolean actual = troll.isAlive();
        assertEquals(false, actual);
    }



}
