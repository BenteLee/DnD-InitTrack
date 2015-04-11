package GameSetters;

import static Participants.ParticipantsManager.*;


public class SettingUp {

    public static void main(String[] args) {
      //UI.MainUI.launch(args);
    }

    public static void newRound() {
        clearStatusList();
        clearBoostsList();
        TurnKeeper.resetTurns();
        setnewInisative();
    }
}
