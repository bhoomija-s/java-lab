/*Convert an Array to a List and Vice Versa 
Problem: 
• Convert an Integer[] array into a List<Integer> and back to an array. 
Hint: Use Arrays.asList() and toArray(). */
import java.util.*;

public class q4_set4 {
    public static void main(String[] args) {
        Integer[] array = {10, 20, 30};
        
        // Array to List
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        
        // List back to Array
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArray));
    }
}