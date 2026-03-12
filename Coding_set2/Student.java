/*Student Details
Create a class Student with data members name and rollNo. Use a constructor to
initialize them and display the student details.*/


      class Student{
        int rollno;
        String name;
        Student(int r, String n){
            rollno = r;
            name = n;
        }
        void display(){
            System.out.print("Rollno: "+ rollno + " Nmae: "+ name);
        }
    
public static void main(String [] args){
    
    Student s = new Student(20,"bhoomi");
    s.display();
}
}