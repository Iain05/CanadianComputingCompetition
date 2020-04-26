import java.util.Scanner;

class Main {
  	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int spacesLength = Integer.parseInt(input.nextLine());

		String yesterday = input.nextLine();
		String today = input.nextLine();
		input.close();

		int counter = 0;

		for (int i = 0; i < spacesLength; i++) {
			if (yesterday.charAt(i) == today.charAt(i) && today.charAt(i) == 'C') {
				counter++;
			}
		}
		System.out.println(counter);
  	}
}
