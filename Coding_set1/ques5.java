//5. Find the Maximum and Minimum Elements in a List 
//Problem: 
//• Given a List<Integer>, find and print the maximum and minimum values. 
//Hint: Use Collections.max() and Collections.min(). 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; // is a class have so many inbuilt method that can help 

public class ques5{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
         list.add(5);
          list.add(7);
           list.add(0);
            list.add(4);
             list.add(23);
        System.out.print("max : "+ Collections.max(list));
        System.out.print("min : "+ Collections.min(list));
    }

}