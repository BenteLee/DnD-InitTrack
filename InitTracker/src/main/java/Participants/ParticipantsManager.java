package Participants;

import java.util.ArrayList;
import java.util.List;

public class ParticipantsManager {

    //a List of al Perticapents in the game
    public static List<Playable> participantList = new ArrayList<>();

    public static void addPlayer(String name, int init) {
        Player play = new Player(name, init);
        participantList.add(play);
    }

    public static void addNPC(String name, int init) {
        NPC play = new NPC(name, init);
        participantList.add(play);
    }

    public static void addStatus(int index, String status, int rounds) {
        participantList.get(index).addStatus(status, rounds);
    }

    public static void addBoost(int index, String boost, int rounds) {
        participantList.get(index).addBoost(boost, rounds);
    }

    public static void setNewTurn() {
        for (Playable participantList1 : participantList) {
            participantList1.turnTaken();
        }
    }
    
    public static void setnewInisative(){
        for (Playable participantList1 : participantList) {
            participantList1.setInisative();
        }
        //reorderList();
    }
    
    public static void clearStatusList(){
        for (Playable participantList1 : participantList) {
            participantList1.statusList.clear();
        }
    }
    
    public static void clearBoostsList(){
        for (Playable participantList1 : participantList) {
            participantList1.boostsList.clear();
        }
    }

    private static void reorderList() {
        participantList.sort(null);
    }
}
