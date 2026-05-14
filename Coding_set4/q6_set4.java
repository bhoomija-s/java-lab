/* Reverse a List 
Problem: 
• Given a List<String>, reverse its elements. 
Hint: Use Collections.reverse(). */
 import java.util.*;

public class q6_set4 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Collections.reverse(colors);
        System.out.println(colors); // [Blue, Green, Red]
    }
}