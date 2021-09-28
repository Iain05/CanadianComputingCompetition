import java.util.Scanner;
class Main {
  	public static void main(String[] args) {
		int row = 0;
		int col = 0;
		int Total = 0;
		boolean magic = true;

		Scanner input = new Scanner(System.in);
		int[][] arr = new int[4][4];


		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			Total += arr[0][i];
		}
		for (int i = 0; i < 4; i++){
			row = 0;
			col = 0;
			for (int j = 0; j < 4; j++) {
				row += arr[i][j];
				col += arr[j][i];
			}
			if (row != Total || col != Total) {
				magic = false;
			}
		}
		if (magic == true) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}
  	}
}
