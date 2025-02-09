import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner keyboard;
	
	public HumanPlayer(String name, Scanner keyboard) {
		super(name);
		this.keyboard = keyboard;
	}
	
	@Override
	public int[] getMove(int[] pileSizes) {
		System.out.println("Piles: " + Arrays.toString(pileSizes));
		int pileIdx = getUserInput("Enter pile index: ");
		int numObjects = getUserInput("Enter object number: ");
		return new int[] {pileIdx, numObjects};
	}

	public int getUserInput(String prompt) {
		// TODO: Implement this method.
		int num = 0;
		try {
			while(keyboard.hasNextInt()) {
				System.out.print(prompt);
				num = keyboard.nextInt();
			}
		}
		catch(InputMismatchException e) {
			keyboard.nextLine();
		}
		return num;
		
		//OLD CODE
		
//		int input = 0;
//		boolean error = true;
//		while(error) {
//			try {
//				System.out.println(prompt);
//				input = keyboard.nextInt();
//				error = false;
//				return input;
//			}
//			catch(InputMismatchException e) {
//				keyboard.nextLine();
//			}
//		}
//		return input;
	}
	
	@Override
	public void notifyIllegalMove(String moveInfo) {
		System.out.println(moveInfo);
		System.out.println();
	}
	
	@Override
	public void notifyOpponentMove(String name, int[] move) {
		String notification = name + " removed " + move[1] + " from pile " 
				+ move[0] + ".";
		System.out.println(notification);
		System.out.println();
	}
	
	@Override
	public void notifyWin() {
		System.out.println("Nice job, " + getName() + ". You win!");
	}
	
	@Override
	public void notifyLose() {
		System.out.println("Sorry, " + getName() + ". You lose :(");
	}
}
