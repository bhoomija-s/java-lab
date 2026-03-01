//7. Sort a List in Ascending and Descending Order 
//Problem: 
//• Given a List<Integer>, sort it in both ascending and descending order. 
//Hint: Use Collections.sort() and Collections.reverseOrder(). 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; // is a class have so many inbuilt method that can help 

public class que7{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
         list.add(5);
          list.add(7);
           list.add(0);
            list.add(4);
             list.add(23);
      Collections.sort(list);
      System.out.print("List in ascending"+ list);
      Collections.sort(list, Collections.reverseOrder()); //Sort list but follow reverse comparison rule. as reverse order is rule
      System.out.print("List in descending"+ list);

    }

}