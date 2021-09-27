import java.util.*;

public class J4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();
        boolean found = false;

        for (int j = 0; j < b.length(); j++) {
            if (a.contains(b)) {
                found = true;
                System.out.println("yes");
                break;
            }
            b = b.charAt(b.length() - 1) + b.substring(0, b.length() - 1);
        }
        if (!found) {
            System.out.println("no");
        }
    }
}