package Participants;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParticipantsManagerTest {

    static String namePlayer = "Bente Lee";
    static int initPlayer = 5;
    static String nameNPC = "Krusk";
    static int initNPC = 8;
    static Player player;
    static NPC npc;

    public ParticipantsManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        ParticipantsManager.addPlayer(namePlayer, initPlayer);
        player = (Player) ParticipantsManager.participantList.get(0);

        ParticipantsManager.addNPC(nameNPC, initNPC);
        npc = (NPC) ParticipantsManager.participantList.get(1);

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test if a player gets added tot the list in the correct way
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        assertEquals(namePlayer, player.name);
        assertTrue(initPlayer == player.inisialInisative);
    }

    /**
     * Test if a NPC gets added tot the list in the correct way
     */
    @Test
    public void testAddNPC() {
        System.out.println("addNPC");
        assertEquals(nameNPC, npc.name);
        assertTrue(initNPC == npc.inisialInisative);
    }

    /**
     * Test of addStatus method, of class ParticipantsManager.
     */
    @Test
    public void testAddStatus() {
        System.out.println("addStatus");
        int index = 1;
        String status = "blinded";
        int rounds = 4;
        ParticipantsManager.addStatus(index, status, rounds);
        ParticipantsManager.participantList.get(1).PrintOutStatus();
        assertEquals("blinded unless you have blind fight", npc.statusList.get(0).effect);
        assertTrue(rounds == npc.statusList.get(0).activeRounds);

    }

    /**
     * Test of addBoost method, of class ParticipantsManager.
     */
    @Test
    public void testAddBoost() {
        System.out.println("addBoost");
        int index = 0;
        String boost = "Bard Song";
        int rounds = 8;
        ParticipantsManager.addBoost(index, boost, rounds);
        assertEquals("Bard Song", player.boostsList.get(0).boostName);
        assertTrue(rounds == player.boostsList.get(0).activeRounds);
    }

    /**
     * Test of setNewTurn method, of class ParticipantsManager.
     */
    @Test
    public void testSetNewTurn() {
        System.out.println("setNewTurn");
        int index = 1;
        String status = "blinded";
        int rounds = 6;
        ParticipantsManager.addStatus(index, status, rounds);
        ParticipantsManager.participantList.get(1).PrintOutStatus();
        ParticipantsManager.setNewTurn();
        assertTrue((rounds-1) == npc.statusList.get(1).activeRounds);

    }

    /**
     * Test of setnewInisative method, of class ParticipantsManager.
     */
    @Test
    public void testSetnewInisative() {
        System.out.println("setnewInisative");
        ParticipantsManager.setnewInisative();
        assertTrue((21 + initPlayer) > player.inisiative);
        assertTrue(initPlayer < player.inisiative);

    }
}
