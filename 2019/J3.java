  
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
	  	int previousStop = -1;

	  	Scanner input = new Scanner(System.in);
	  	int numberOfLines = Integer.parseInt(input.nextLine());
	  	String[] sequences = new String[numberOfLines];

	  	for (int i = 0; i < numberOfLines; i++) {
		  	sequences[i] = input.nextLine();
 	  	} 
		input.close();

		for (int i = 0; i < numberOfLines; i++) {
			for(int j = 0; j < sequences[i].length(); j++) {

				if (j < (sequences[i].length() - 1)) {
					if (sequences[i].charAt(j) != sequences[i].charAt(j+1)) {
						System.out.print(j - previousStop + " " + sequences[i].charAt(j) + " ");
						previousStop = j;
					}
				} else {
					System.out.print(j - previousStop + " " + sequences[i].charAt(j));
				}
			}
			System.out.println();
			previousStop = -1;
		}
  	}
}
