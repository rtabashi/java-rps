public class Judge {
	public void startGame(Player player1, Player player2) {
		System.out.println("start");
		System.out.println();
		for (int cnt = 0; cnt < 3; cnt++) {
			System.out.println("round " + (cnt + 1));
			Player winner = judgeGame(player1, player2);
			if (winner != null) {
				System.out.println("win " + winner.getName());
				winner.notifyResult(true);
			} else {
				System.out.println("draw");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("end");
		System.out.println();
		Player finalWinner = judgeFinalWinner(player1, player2);
		System.out.println(player1.getWinCount() + " vs " + player2.getWinCount());
		if (finalWinner != null) {
			System.out.println("winner " + finalWinner.getName());
		} else {
			System.out.println("draw");
		}
	}
	private Player judgeGame(Player player1, Player player2) {
		Player winner = null;
		int player1hand = player1.showHand();
		int player2hand = player2.showHand();
		
		printHand(player1hand);
		System.out.print(" vs ");
		printHand(player2hand);
		System.out.println();

		if ((player1hand == Player.ROCK && player2hand == Player.SCISSORS)
				|| (player1hand == Player.PAPER && player2hand == Player.ROCK)
				|| (player1hand == Player.SCISSORS && player2hand == Player.PAPER)) {
			winner = player1;
		} else if ((player2hand == Player.ROCK && player1hand == Player.SCISSORS)
				|| (player2hand == Player.PAPER && player1hand == Player.ROCK)
				|| (player2hand == Player.SCISSORS && player1hand == Player.PAPER)) {

			winner = player2;
		}
		return winner;
	}
	private Player judgeFinalWinner(Player player1, Player player2) {
		Player winner = null;
		int player1WinCount = player1.getWinCount();
		int player2WinCount = player2.getWinCount();
		
		if (player1WinCount > player2WinCount) {
			winner = player1;
		} else if (player2WinCount > player1WinCount) {
			winner = player2;
		}
		return winner;
	}
	private void printHand(int hand) {
		switch (hand) {
		case Player.ROCK:
			System.out.print("rock");
			break;
		case Player.PAPER:
			System.out.print("paper");
			break;
		case Player.SCISSORS:
			System.out.print("scissors");
			break;
		default :
			break;
		}
	}
}
