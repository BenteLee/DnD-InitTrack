package Status_Boosts;

public class Status {
	public String statusName;
	public int activeRounds;
	public String effect;

	public Status(String statusName, int rounds) {
		this.statusName = statusName;
		this.activeRounds = rounds;
		this.effect = StatusEffect.GetStatusEffect(statusName);

	}
}
