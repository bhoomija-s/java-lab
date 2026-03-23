/*6. Hospital Management
Create class Person with name and age.
Create subclass Patient with disease and doctorAssigned.
 Display complete papatient information.*/
  class Person {
    String name;
    int age;
    Person(String n, int a){
        name = n;
        age = a;
    }
    void display(){
         System.out.println("Name : " + name);
          System.out.println("Age: "+ age);
    }
  }
  class Patient extends Person{
    String disease;
    String doctorAssigned;
    Patient (String n, int a, String d, String dr){
        super(n,a);
        disease = d;
        doctorAssigned = dr;

    }
    void display(){
        super.display();
         System.out.println(" Disease: "+ disease );
          System.out.println("doctorAssigned: "+ doctorAssigned);
    }

  }
 public class Personq6{
   public static void main(String[] args){
    Patient s1 = new Patient( "shagun", 28,"Covid","Brutus");
    
    s1.display();
 }
  }
