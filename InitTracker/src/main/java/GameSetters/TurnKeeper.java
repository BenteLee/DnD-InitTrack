package GameSetters;

import Participants.ParticipantsManager;

public class TurnKeeper {

    public static int turnsPassed = 0;

    public static void nextTurn() {
        ParticipantsManager.setNewTurn();
        turnsPassed += 1;
    }
    
    public static void resetTurns(){
        turnsPassed = 0;
    }
}
