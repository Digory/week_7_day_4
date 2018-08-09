package main.room;

import java.util.Random;

public class Room {
    private ExitType[] exits;
    private Random random;
    private ExitType theExit;

    public Room(){
        exits = new ExitType[4];
        createExit();
    }

    private void createExit(){
        exits[0] = ExitType.WEST;
        exits[1] = ExitType.EAST;
        exits[2] = ExitType.NORTH;
        exits[3] = ExitType.SOUTH;
        random = new Random();
        int randomNumber = random.nextInt(4);
        theExit = exits[randomNumber];
    }

    public ExitType getTheExit(){
        return theExit;
    }
}
