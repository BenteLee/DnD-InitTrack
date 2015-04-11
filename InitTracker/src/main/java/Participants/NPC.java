package Participants;

import java.util.Random;

import Status_Boosts.Boost;
import Status_Boosts.Status;

class NPC extends Playable {

//    String name;
//    int inisialInisative;
//    public int inisiative;
//   public List<Status> statusList = new ArrayList<>();
//   public List<Boost> boostsList = new ArrayList<>();
    NPC(String name, int inisialInisative) {
        this.name = name;
        this.inisialInisative = inisialInisative;
    }

    @Override
    int setInisative() {
        inisiative = new Random().nextInt(20);
        inisiative += inisialInisative;
        return inisiative;
    }

    @Override
    void addStatus(String status, int rounds) {
        statusList.add(new Status(status, rounds));
    }

    @Override
    void addBoost(String boost, int rounds) {
        boostsList.add(new Boost(boost, rounds));
    }

    @Override
    void turnTaken() {
        for (int i = 0; i < statusList.size(); i++) {
            statusList.get(i).activeRounds += -1;
            if (statusList.get(i).activeRounds == 0) {
                statusList.remove(i);
            }
        }
    }

    @Override
    public void PrintOutStatus() {
        for (Status statusList1 : statusList) {
            System.out.println(statusList1.statusName + " " + statusList1.activeRounds);
            System.out.println(statusList1.effect);
        }
    }
}
