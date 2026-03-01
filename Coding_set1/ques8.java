/*8. Count the Frequency of Elements in a List 
Problem: 
• Given a List<String>, count how many times each string appears. 
List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", 
"apple"); 
System.out.println(countFrequencies(words));   
// Output: {apple=3, banana=2, orange=1} 
Hint: Use a HashMap<String, Integer>.*/
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class ques8{
    public static HashMap <String, Integer> countFrequencies (List<String> words ){  //hasmap is return type and list is parameter 
    //  countFrequence is name of fuction
         HashMap<String, Integer> map = new HashMap<>(); //we created a hasmap
         for(String word : words){  //loop for storing words of list in word
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
         }
         return map;

    }
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
       
        System.out.println(countFrequencies(words));  



    }
}