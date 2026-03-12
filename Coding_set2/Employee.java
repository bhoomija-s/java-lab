/*. Employee Information
Create a class Employee with attributes name, designation, and salary. Initialize
them using a constructor and display the employee information*/

     class Employee{
        String name;
        String designation;
        float salaray;

        Employee(String n, String d, float s){
         name = n;
         designation =d;
         salaray = s;
        }
        void display(){
            System.out.println("Name of The Employee: "+ name);
             System.out.println("Designation of The Employee: "+ designation);
            System.out.println("of The Employee: "+ salaray);
        }
    
    public static void main(String[] args){
         Employee em = new Employee("RAY","Manager",1000000.98f);
         em.display();
    }
}