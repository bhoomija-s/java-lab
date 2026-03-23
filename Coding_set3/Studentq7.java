/*7. School Result System
Create class Student with name and marks.
Create subclass Result with grade.
 Compute grade and display result using inherited data.*/
 
    class Student{
    String name;
    int marks;
    Student(String n , int m){
        name = n;
        marks = m;
    } 
    void display(){
        System.out.println("Name: "+name);
        System.out.println("marks: "+ marks);
    }

 }
 class Result extends Student {
    String grade;
    Result(String n, int m){
        super(n,m);
        Calculate();
    }
    void Calculate( ){
        if( marks>90){
           grade =" A";
        }
        else if(marks>40){
            grade =" B";
        }
        else grade = "c";
    }
    void display(){
        super.display();
        System.out.println("Grade: "+ grade);

    }

 }
 public class Studentq7{
 public static void main(String[] args){
    Result s1 = new Result( "shagun", 28);
    
    s1.display();
 }
 }
