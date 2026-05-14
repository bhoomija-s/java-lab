/*Check if a List Contains a Specific Element 
Problem: 
• Given a List<String>, check if a specific string is present. 
Hint: Use the contains() method of List. */
import java.util.*;

public class q3_set4 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.contains("Banana")); // true
    }
}