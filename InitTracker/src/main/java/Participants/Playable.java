package Participants;

import Status_Boosts.Boost;
import Status_Boosts.Status;
import java.util.ArrayList;
import java.util.List;

abstract class Playable {
    
    String name;
    int inisialInisative;
    public int inisiative;
    public List<Status> statusList = new ArrayList<>();
    public List<Boost> boostsList = new ArrayList<>();
    
    abstract int setInisative();

    abstract void addStatus(String status, int rounds);

    abstract void addBoost(String boost, int rounds);

    abstract void turnTaken();
    
    abstract void PrintOutStatus();

}
