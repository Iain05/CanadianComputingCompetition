import java.util.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	int a1 = input.nextInt();
	int a2 = input.nextInt();
	int a3 = input.nextInt();
	int b1 = input.nextInt();
	int b2 = input.nextInt();
	int b3 = input.nextInt();

	input.close();

	int A = (a1 * 3 + a2 * 2 + a3);
	int B = (b1 * 3 + b2 * 2 +b3);
	
	if (A > B) {
		System.out.println("A");
	} else if (A < B) {
		System.out.println("B");
	} else {
		System.out.println("T");
	}

  }
}
