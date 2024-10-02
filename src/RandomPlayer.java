import java.util.Random;

public class RandomPlayer extends Player{

	private Random generator;
	
	public RandomPlayer(String name) {
		super(name);
		generator = new Random();
	}
	
	public int[] getMove(int[] pileSizes) {
		return pileSizes;
		
		//OLD CODE
		
//		int[] move = {0,0};
//		move[0] = generator.nextInt(pileSizes.length);
//		move[1] = generator.nextInt(pileSizes[move[0]]+1);
//		System.out.println(move[1]);
//		return move;
		
	}
}
