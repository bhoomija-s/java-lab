/* Employee Salary System
Create a class Employee with name and baseSalary.
Create subclass Manager with bonus.
 Calculate total salary using inherited data.*/
class Employee{
    String name;
    float baseSalary;
    Employee(String n, float b){
        name = n;
        baseSalary = b;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary:" + baseSalary);

    }
}
class Manager extends Employee{
    float bonus;
 Manager(String n, float b , float c){
    super(n,b);
    bonus = c;
 }
 float calculate(){
    return baseSalary + bonus;
 }
 void display(){
    super.display();
    
            System.out.println("Totalsalary " + calculate() );

 }
}
public class Employeeq2{
 
 public static void main(String[] args){
    Manager s1 = new Manager("Shagun", 20000,247 );
    
    s1.display();
}
}
