import java.util.Scanner;

public class Main {
	
	// Declaration of 2x2 thingimajig
	public static int[][] myGrid = new int[2][2];

	public static void main(String[] args) {
		
		// Initialize 2x2 thingimajig
		myGrid[0][0] = 1;
		myGrid[0][1] = 2;
		myGrid[1][0] = 3;
		myGrid[1][1] = 4;
			
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
		System.out.println(myGrid[0][0] + " " + myGrid[0][1]);
		System.out.println(myGrid[1][0] + " " + myGrid[1][1]);
		
	}
	
	//how does this even work i want to do the bad bad die die
	public static void horizontalFlip() {
		int temp = myGrid[0][0];
		myGrid[0][0] = myGrid[1][0];
		myGrid[1][0] = temp;
		
		temp = original[0][1];
		myGrid[0][1] =myGrid[1][1];
		myGrid[1][1] = temp;	
	}
	//this is so ugly why did i do this
	public static void verticalFlip() {	
		int temp = myGrid[0][0];
		myGrid[0][0] = myGrid[0][1];
		myGrid[0][1] = temp;
		
		temp = myGrid[1][0];
		myGrid[1][0] = myGrid[1][1];
		myGrid[1][1] = temp;	
	}
}
//WHY WAS I CREATED THIS WAAAAAAAAAYYYYYY
