public class Nim extends Piles{

	private Player currentPlayer;
	private Player waitingPlayer;
	private Piles piles;
	private Player winner = null;
	private Player loser = null;

	public Nim(Player p1, Player p2, int[] initSizes) {
		currentPlayer = p1;
		waitingPlayer = p2;
		piles = new Piles(initSizes);
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getWaitingPlayer() {
		return waitingPlayer;
	}

	public int[] getPileSizes() {
		return piles.getSizes();
	}

	public Player getWinner() {
		return winner;
	}

	public Player getLoser() {
		return loser;
	}

	public void takeTurn() {
		// TODO: Implement this method.
		currentPlayer.getMove(getPileSizes());
		//if(!notifyIllegalMove()){
		//notifyOppenentMove();
		//}
		
		//if(notifyIllegalMove){
		//notify IllegalMove
		
		
		//OLD CODE
		
		//int arrays might need to be under try
		
		
//		int[] pileSizes = getPileSizes();
//		int[] move = currentPlayer.getMove(pileSizes);
//		try {
//			piles.removeObjects(move);
//			waitingPlayer.notifyOpponentMove(currentPlayer.getName(), move);
//		} catch (IllegalMoveException e) {
//			// TODO Auto-generated catch block
//			currentPlayer.notifyIllegalMove(e.getMessage());
//			takeTurn();
//			//e.printStackTrace();
//		}
		
	}

	public void checkGameOver() {
		if (piles.isEmpty()) {
			winner = waitingPlayer;
			loser = currentPlayer;
		}
	}

	public void swapPlayers() {
		Player temp = currentPlayer;
		currentPlayer = waitingPlayer;
		waitingPlayer = temp;
	}

	public void play() {
		while (winner == null || loser == null) {
			takeTurn();
			checkGameOver();
			swapPlayers();
		}
		winner.notifyWin();
		loser.notifyLose();
	}
}
