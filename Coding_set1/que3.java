// Check if a List Contains a Specific Element 
//Problem: 
//• Given a List<String>, check if a specific string is present. 
//Hint: Use the contains() method of List.
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


 public class que3{
    public static void main(String[] args){
         List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2, 5));
         int specfic = 3;
          boolean result = numbers.contains(specfic); // not like removeif
         System.out.println(result);
    }
}