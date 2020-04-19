
import java.util.*;
 
public class RuleOfThree {
 
 
 
    // Function 1
    private static String getNewString(String original, int startIndex, int endIndex, String changeTo){
        return original.substring(0, startIndex) +  changeTo + original.substring(endIndex);
    }
 
 
 
    // Function 2 - Get next 'States'
    private static ArrayList<String> getMoves(String[] ruleOne, String[] ruleTwo, String[] ruleThree, String current){
        ArrayList<String> moves = new ArrayList<>();
        for (int i = 0; i < current.length(); i++){
            try {
                if (current.contains(ruleOne[0])){
                    String ruleOneSubString = current.substring(i, i + ruleOne[0].length());
                    if (ruleOneSubString.equals(ruleOne[0])) {
                        moves.add("1 " + i + " " + (i + ruleOne[0].length()) + " " + getNewString(current, i, i + ruleOne[0].length(), ruleOne[1]));
                    }
                } } catch (StringIndexOutOfBoundsException e){}
            try {
                if (current.contains(ruleTwo[0])){
                    String ruleTwoSubString = current.substring(i, i + ruleTwo[0].length());
                    if (ruleTwoSubString.equals(ruleTwo[0])) {
                        moves.add("2 " + i + " " + (i + ruleTwo[0].length()) + " " + getNewString(current, i, i + ruleTwo[0].length(), ruleTwo[1]));
                    }
                } } catch (StringIndexOutOfBoundsException e){}
            try {
                if (current.contains(ruleThree[0])){
                    String ruleThreeSubString = current.substring(i, i + ruleThree[0].length());
                    if (ruleThreeSubString.equals(ruleThree[0])) {
                        moves.add("3 " + i + " " + (i + ruleThree[0].length()) + " " + getNewString(current, i, i + ruleThree[0].length(), ruleThree[1]));
                    }
                } } catch (StringIndexOutOfBoundsException e){}
        }
        return moves;
    }
 
 
    //Function 3
    private static void findSolution(String[] ruleOne, String[] ruleTwo, String[] ruleThree,
                                     String current, String desired, int movesTaken, int movesAllowed, String[] solution, ArrayList<String> visited){
        if (movesTaken == movesAllowed){ // if number of moves that we've done is equal to the allowed number of moves, we need to stop.
            if (current.equals(desired)){
                for (String move: solution){ // win condition, we are done here
                    System.out.println(move);
                }
                System.exit(0);
            }
            return;
        }
 
 
        visited.add(current + " " + movesTaken);
        ArrayList<String> moves = getMoves(ruleOne, ruleTwo, ruleThree, current); // need to get the next states
        if (moves.size() > 0){
            for (String move: moves){
                String[] split = move.split(" ");
                if (!visited.contains(split[3] + " " + (movesTaken+1))) {
                    String addTo = split[0] + " " + (Integer.parseInt(split[1]) + 1) + " " + split[3];
                    solution[movesTaken] = addTo;
                    findSolution(ruleOne, ruleTwo, ruleThree, split[3], desired, movesTaken + 1, movesAllowed, solution, visited);
                    solution[movesTaken] = "";
                }
            }
        }
    }
 
 
 
    //Function 4 - Store and Assign and Input
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] ruleOne = in.nextLine().split(" ");
        String[] ruleTwo = in.nextLine().split(" ");
        String[] ruleThree = in.nextLine().split(" ");
        String[] values = in.nextLine().split(" ");
        String[] solution = new String[Integer.parseInt(values[0])];
        ArrayList<String> visited = new ArrayList<>();
        findSolution(ruleOne, ruleTwo, ruleThree, values[1], values[2], 0, Integer.parseInt(values[0]), solution, visited);
    }
}
