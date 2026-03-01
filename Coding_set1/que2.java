//2. Remove an Element from a List 
//Problem: 
//• Given a List<Integer>, remove all occurrences of a specific number. 
//List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5); 
//int target = 2; 
//System.out.println(removeElement(numbers, target));   
// Output: [1, 3, 4, 5] 
//Hint: Use removeIf() method. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class que2{
    public static void main(String[] args){
       List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2, 5)); 
      int target = 2; 
       numbers.removeIf(n->n==target);
       System.out.println(numbers);


    }
 }