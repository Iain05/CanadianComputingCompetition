import java.util.Scanner;

class J1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num_1 = input.nextInt();
		int num_2 = input.nextInt();
		int num_3 = input.nextInt();
		int num_4 = input.nextInt();
		input.close();

		if ((num_1 == 8 || num_1 == 9) && (num_2 == num_3) && (num_4 == 8 || num_4 == 9)) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
	}
}
