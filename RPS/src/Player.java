/*
 * player of rock-paper-scissors
 * 0:rock
 * 1:paper
 * 2:scissors
 */
public class Player {
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
	
	private String name;
	private int winCount = 0;
	private Tactics tactics;
	
	public Player() {
		this.name = "anonymous";
	}
	public Player(String name) {
		this.name = name;
	}
	public int showHand() {
		int hand = tactics.readTactics();
		return hand;
	}
	public void notifyResult(boolean result) {
		if (result == true) {
			this.winCount++; 
		}
	}
	public int getWinCount() {
		return this.winCount;
	}
	public String getName() {
		return this.name;
	}
	public void setTactics(Tactics tactics) {
		this.tactics = tactics;
	}
}
