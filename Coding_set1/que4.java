//4. Convert an Array to a List and Vice Versa 
//Problem: 
//Convert an Integer[] array into a List<Integer> and back to an array. 
//Hint: Use Arrays.asList() and toArray().
import java.util.Arrays;
import java.util.List;

public class que4{
    public static void main(String[] args){
        Integer arr[]={1,2,3}; //as here we will convert it into list so use wrapper class
        //arrays are static thats why they belng to class
        List<Integer> list = Arrays.asList(arr); //arrays is class toList is a method
       System.out.println("List: " + list);
        //list is an interface it belongs to obejct to thats why

         Integer newArr[] = list.toArray(new Integer[0]);     //as lsit is an objetc name
              System.out.print("array: ");
                for(Integer x : newArr){
                    System.out.print(x + " ");
                }
    
}
}