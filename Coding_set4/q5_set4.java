/*. Find the Maximum and Minimum Elements in a List 
Problem: 
• Given a List<Integer>, find and print the maximum and minimum values. 
Hint: Use Collections.max() and Collections.min(). 
*/
import java.util.*;

public class  q5_set4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9);
        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Min: " + Collections.min(nums));
    }
}