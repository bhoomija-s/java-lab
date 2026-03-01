/*//9. Find Common Elements Between Two Lists 
//Problem: 
//• Given two List<Integer>, find the common elements. 
//List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); 
List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7); 
System.out.println(findCommonElements(list1, list2));   
// Output: [3, 4, 5] 
Hint: Use retainAll() method. */
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


 public class ques9 {
    public static List<Integer> commonNum (List<Integer> list1, List<Integer> list2){
        List<Integer> result = new ArrayList<>(list1); //make a new list which has list1 eleme which we got from parameter
        //as collections is a class used only in collection and retain all is a part of it
        result.retainAll(list2); //// keep only common elements
        return result;
    }
    public static void main(String[] args ){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); 
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7); 
       // commonNum(list1,list2);
        System.out.println( commonNum(list1,list2));
    }
 }