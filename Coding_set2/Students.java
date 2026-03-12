/*Student Marks Using Array
Create a class Student that stores marks of 5 subjects in an array. Use a
constructor to initialize the array and write a method to calculate the average
marks.*/
import java.util.Arrays;

   class Students{
        int arrm[];
        
        Students(int a[]){
            arrm = a;
           
        }
        int calculate(){
            int sum = 0;
            for(int i=0;i<5;i++){
               sum += arrm[i];
            }
            int avg = sum/5;
            return avg;
        }
        void display(){
            int avg= calculate();
            System.out.print("The average marks of 5 Students: "+ avg);
        }
    
    public static void main(String[] args ){
        int marks[]={100,39,69,79,56};
        Students s1 = new Students(marks);
        s1.display();
    }
}