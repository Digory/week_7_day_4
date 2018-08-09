package test;

import main.enemy.Orc;
import main.enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnemyTest {
    private Orc orc;
    private Troll troll;

    @Before
    public void before(){
        orc = new Orc();
        troll = new Troll();
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



}
