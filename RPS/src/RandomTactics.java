public class RandomTactics implements Tactics {
	public int readTactics() {
		int hand = new java.util.Random().nextInt(3);
		return hand;
	}
}
