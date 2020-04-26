import java.util.*;

class Main {
  	public static void main(String[] args) {

		int[] distances = new int[4];
		int[]coordinates = new int [5];
		coordinates [0] = 0;


		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			distances[i] = input.nextInt();
		}
		input.close();

		for (int i = 1; i < 5; i++) {
			coordinates[i] = coordinates[i-1] + distances[i-1];
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int pairDistance = Math.abs(coordinates[j] - coordinates[i]);
				System.out.print(pairDistance + " ");
			}
			System.out.println();
		}
  	}
}
