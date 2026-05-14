/*Sort a List in Ascending and Descending Order 
Problem: 
• Given a List<Integer>, sort it in both ascending and descending order. 
Hint: Use Collections.sort() and Collections.reverseOrder(). */
import java.util.*;

public class q7_set4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(40, 10, 30, 20));
        
        Collections.sort(nums);
        System.out.println("Ascending: " + nums);
        
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Descending: " + nums);
    }
}