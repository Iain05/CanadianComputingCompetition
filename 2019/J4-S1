import java.util.Scanner;

public class Main {
	
	// Declaration of 2x2 thingimajig
	public static int[][] original = new int[2][2];

	public static void main(String[] args) {
		
		// Initialize 2x2 thingimajig
		original[0][0] = 1;
		original[0][1] = 2;
		original[1][0] = 3;
		original[1][1] = 4;
			
		// Input
		Scanner input = new Scanner(System.in);
		String flips = input.nextLine();
		input.close();
		
		// Fliparoo 
		for (int i = 0; i < flips.length(); i++) {	
			if (flips.charAt(i) == 'H') {
				horizontalFlip();
			} else {
				verticalFlip();
			}
		}
		
		// Output WhAt aM i dOiNg rEeEeEeEeEeEEeeEeEeee
		System.out.println(original[0][0] + " " + original[0][1]);
		System.out.println(original[1][0] + " " + original[1][1]);
		
	}
	
	//how does this even work i want to do the bad bad die die
	public static void horizontalFlip() {
		int temp = original[0][0];
		original[0][0] = original[1][0];
		original[1][0] = temp;
		
		temp = original[0][1];
		original[0][1] = original[1][1];
		original[1][1] = temp;	
	}
	//this is so ugly why did i do this
	public static void verticalFlip() {	
		int temp = original[0][0];
		original[0][0] = original[0][1];
		original[0][1] = temp;
		
		temp = original[1][0];
		original[1][0] = original[1][1];
		original[1][1] = temp;	
	}
}
//WHY WAS I CREATED THIS WAAAAAAAAAYYYYYY
