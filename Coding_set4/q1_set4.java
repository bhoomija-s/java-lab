/*. Add and Retrieve Elements from an ArrayList 
Problem: 
• Create an ArrayList<String>, add five names to it, and print each name using a 
loop. 
Hint: Use add() and get() methods of ArrayList. */
import java.util.ArrayList;

public class q1_set4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}