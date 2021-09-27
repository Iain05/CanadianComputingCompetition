import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numValues = input.nextInt();
        String[] values = new String[numValues];
        int highestX = 0;
        int lowestX = 100;
        int highestY = 0;
        int lowestY = 100;
        int tempX = 0;
        int tempY = 0;

        for (int i = 0; i < numValues; i++) {
            values[i] = input.next();
        }
        for (int i = 0; i < numValues; i++) {
            String[] arrStr = values[i].split(",", 2);
            tempX = Integer.parseInt(arrStr[0]);
            tempY = Integer.parseInt(arrStr[1]);

            if (tempX > highestX) {
                highestX = tempX;
            }
            if (tempX < lowestX) {
                lowestX = tempX;
            }
            if (tempY > highestY) {
                highestY = tempY;
            }
            if (tempY < lowestY) {
                lowestY = tempY;
            }
        }

        System.out.println((lowestX - 1) + "," + (lowestY - 1) + "\n" + (highestX + 1) + "," + (highestY + 1));
        input.close();
    }
}