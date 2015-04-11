package Status_Boosts;

class StatusEffect {

	static String GetStatusEffect(String statusName) {
		String effect;
		switch (statusName) {
		case "blinded":
			effect = "blinded unless you have blind fight";
			break;
		case "deafend":
			effect = "ac -3";
			break;
		default:
			effect = "not yet implemented";
		}

		return effect;
	}
}
