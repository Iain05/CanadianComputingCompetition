import java.util.Scanner;

class Main {
  	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

		int p = (input.nextInt()*5) - 400;

		if (p == 100) {
			System.out.println(p + "\n" + 0);
		} else if (p >= 100) {
			System.out.println(p + "\n" + "-1");
		} else {
			System.out.println(p + "\n" + "1");
		}

 	}
}
