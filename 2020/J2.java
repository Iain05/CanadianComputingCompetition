import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int n = input.nextInt();
        int r = input.nextInt();
        input.close();

        int day = 0;
        int totalInfected = 0;

        while (totalInfected <= p) {
            totalInfected += n;
            n = n * r;

            day++;
        }
        System.out.println(day - 1);
    }
}
