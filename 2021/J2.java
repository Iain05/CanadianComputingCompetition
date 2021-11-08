import java.util.Scanner;
import java.util.ArrayList;
class Main {
  	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		
		String person,winner = null;
		int m = -1,bid;
		int value = input.nextInt();

		for (int i = 0; i < value; i++) {
			person = input.next();
			bid = input.nextInt();

			if (bid > m) {
				m = bid;
				winner = person;
			}
		}
		System.out.println(winner);
  	}
}
