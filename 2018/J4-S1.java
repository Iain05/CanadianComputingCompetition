import java.util.*;

class Main {
 	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		int size = Integer.parseInt(input.nextLine());
		int [][] coordinates = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				coordinates[i][j] = input.nextInt();
			}
		}
		input.close();
		//--------------------------------------------------------


		int min = coordinates[0][0];
		int row = 0;
		int column = 0;

		if (coordinates[0][size - 1] < min) {
			row = 0;
			column = size - 1;
			min = coordinates[0][size - 1];
		}

		if (coordinates[size - 1][0] < min) {
			row = size - 1;
			column = 0;
			min = coordinates[size - 1][0];
		}

		if (coordinates[size - 1][size - 1] < min) {
			row = size - 1;
			column = size - 1;
			min = coordinates[size - 1][size - 1];
		}
		//-------------------------------------------------------


		if (row == 0 && column == 0) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(coordinates[j][i] + " ");
				}
				System.out.println();
			}
		}

		else if(row == 0 && column > 0) {
			for (int i = size - 1; i >= 0; i--) {
				for (int j = 0; j < size; j++) {
					System.out.print(coordinates[j][i] + " ");
				}
				System.out.println();
			}
		}

		else if (row > 0 && column > 0) {
			for (int i = size - 1; i >= 0; i--) {
				for (int j = size - 1; j >= 0; j--) {
				System.out.print(coordinates[i][j] + " ");
				} 
				System.out.println();
			} 
		}

		else {
			for (int i = 0; i >= 0; i++) {
				for (int j = size - 1; j >= 0; j--) {
				System.out.print(coordinates[j][i] + " ");
				} 
				System.out.println();
			} 
		}
  	}
}
