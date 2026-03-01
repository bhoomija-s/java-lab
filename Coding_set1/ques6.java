//6. Reverse a List 
//Problem: 
//• Given a List<String>, reverse its elements. 
//Hint: Use Collections.reverse().
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; 

public class ques6{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("i am");
          list.add("no");
           list.add("bs");
            list.add("nice");
             list.add("dhu-ran-dar");
        System.out.println("before reverse");
        for(int i=0;i<list.size();i++){   //size() imp
            System.out.print(list.get(i)+ " "); //java use a get method
        }

         Collections.reverse(list);   // reverse happens here

        System.out.println("\nAfter reverse:");

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }

}