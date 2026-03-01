//1. Add and Retrieve Elements from an ArrayList 
//Problem: 
//• Create an ArrayList<String>, add five names to it, and print each name using a loop. 
//Hint: Use add() and get() methods of ArrayList.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; // put s after array
public class que1{ // main class
    public static void main(String[] args ){  //void main class
ArrayList <String> list = new ArrayList<>(); //S is capital
list.add("Bhoomi");
list.add("Bhoomija");
list.add("Bhoomika");
list.add("SHagun");
list.add("DEVIL");


for(int i =0; i< list.size(); i++){
     System.out.println( ( list.get(i)));
}
    }
}