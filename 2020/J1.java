import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int S = input.nextInt();
		int M = input.nextInt();
		int L = input.nextInt();
		input.close();

		if (1 * S + 2 * M + 3 * L >= 10) {
			System.out.println("Happy");
		} else {
			System.out.println("Sad");
		}
	}
}
