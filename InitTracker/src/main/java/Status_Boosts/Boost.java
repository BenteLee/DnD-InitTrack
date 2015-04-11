package Status_Boosts;

public class Boost {
	public String boostName;
	public int activeRounds;
	public String effect;

	public Boost(String boostName, int rounds) {
		this.boostName = boostName;
		this.activeRounds = rounds;
		this.effect = "not set yet";
	}
}
