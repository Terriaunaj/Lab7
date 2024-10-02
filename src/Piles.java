import java.util.Arrays;

public class Piles {

	private int[] sizes;
	
	public Piles(int... initSizes) {
		
		if(initSizes == null || initSizes.length == 0) {
			throw new IllegalArgumentException();
		}
		for(int i = 0; i < initSizes.length; i++) {
			if(initSizes[i] <= 0) {
				throw new IllegalArgumentException();
			}
		}
		new Piles(initSizes);
		Arrays.copyOf(initSizes,initSizes.length);
		
		//OLD CODE
		
//		boolean boo = false;
//		if(initSizes == null || initSizes.length == 0) {
//			boo = true;
//		}
//		for(int i = 0; i < initSizes.length; i++) {
//			if(initSizes[i] <= 0) {
//				boo = true;
//			}
//		}
//		if(boo == false) {
//			sizes = Arrays.copyOf(initSizes, initSizes.length);
//		}
		
	}
	
	public int[] getSizes() {
		return sizes;
		
		//OLD CODE
		
//		int[] array = Arrays.copyOf(sizes, sizes.length);
//		return array;
	}
	
	public void removeObjects(int[] move) throws IllegalMoveException {
		
		//OLD CODE
		
//		if(move == null) {
//			throw new IllegalMoveException("null move");
//		}
//		else if(!(move.length == 2)) {
//			throw new IllegalMoveException("Invalid length: " + move.length);
//		}
//		else if((move[0] < 0) || (move[0] >= sizes.length)) {
//			throw new IllegalMoveException("Index out of bounds: " + move[0]);
//		}
//		else if(sizes[move[0]] == 0) {
//			throw new IllegalMoveException("Pile " + move[0] + " is empty.");
//		}
//		else if(move[1] <= 0) {
//			throw new IllegalMoveException("Nonpositive object number: " + move[1]);
//		}
//		else if(move[1] > sizes[move[0]]) {
//			throw new IllegalMoveException("Object number greater than pile size: " + move[1] + " > " + sizes[move[0]]);
//		}
//		else {
//			int index = move[0];
//			int num = move[1];
//			sizes[index] -= num;
//		}
	}
	
	public boolean isEmpty() {
		
		//OLD CODE
		
//		int count = 0;
//		for(int i = 0; i < sizes.length; ++i) {
//			if(sizes[i] == 0) {
//				++count;
//			}
//			if(count == sizes[0]) {
//				return true;
//			}
//		}
//		return false;
		return false;
		
	}

}
