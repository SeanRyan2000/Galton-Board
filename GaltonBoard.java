import java.util.*;

public class GaltonBoard {
	public static void main(String[] args) {
		//balls input
		Scanner ballsInput = new Scanner(System.in);
		System.out.println("Enter number of balls to drop");
		int balls = ballsInput.nextInt();
		
		//slots input
		Scanner slotsInput = new Scanner(System.in);
		System.out.println("Enter number of slots in the machine");
		int slots = slotsInput.nextInt();
		
		//Final position = amount of rights 
		int output[] = new int[slots+1];
		
		// balls
		for (int i = 0; i < balls; i++) {
			int right = 0;
			//direction ball goes through slots
			for (int j = 0; j < slots; j++) {
				int random = ((int) (Math.random() * 2)); //random direction
				
				if (random ==0) {
					System.out.print("L"); //Ball goes left
				}else {
					System.out.print("R"); //Ball goes right
					right++;
				}
			}
			output[right] = (output[right] + 1);
			System.out.println(" ball " + (i+1) + " fell in slot " + right);
		}
		
		//histogram
		System.out.println();
		for (int j =0; j< (slots+1); j++) {
			for (int i = 0; i < output[j]; i++) {
				System.out.print("O");
			}
			System.out.println();
		}
	}
}