import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RPS {
	public static void main(String[] args) {
		Judge judge = new Judge();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("your name");
		System.out.print(">");
		String yourName = null;
		while (true) {
			try {
				yourName = br.readLine();
				if (yourName.length() == 0) {
					System.out.println("your name");
					System.out.print(">");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("your name");
				System.out.print(">");
			}
		}
		Player you = new Player(yourName);
		Tactics yourTactics = new AskTactics();
		you.setTactics(yourTactics);
		
		Player brown = new Player("brown");
		Tactics brownTactics = new RandomTactics();
		brown.setTactics(brownTactics);
		
		judge.startGame(you, brown);
	}
}
