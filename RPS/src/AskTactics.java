import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AskTactics implements Tactics {
	public int readTactics() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("input your hand");
		System.out.println("0:rock");
		System.out.println("1:paper");
		System.out.println("2:scissors");
		System.out.print("> ");
		
		int hand = 0;
		while (true) {
			try {
				String input = br.readLine();
				hand = Integer.parseInt(input);
				if (hand == Player.ROCK
						|| hand == Player.PAPER
						|| hand == Player.SCISSORS) {
					break;
				} else {
					System.out.println("try again");
					System.out.print("> ");
				}
			} catch (Exception e) {
				System.out.println("try again");
				System.out.print("> ");
			}
		}
		return hand;
	}
}
