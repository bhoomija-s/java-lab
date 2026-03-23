/*Vehicle Registration System
Create class Vehicle with vehicleNo and ownerName.
Create subclass Car with model and fuelType.
 Use constructor chaining to initialize all details.*/
 
 class Vehicle {
    int v_no;
    String ownerName;

    Vehicle(int v, String o) {
        v_no = v;
        ownerName = o;
    }

    void display() {
        System.out.println("Vehicle No: " + v_no);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Car extends Vehicle {
    String model;
    String fuelType;

    Car(int v, String o, String m, String f) {
        super(v, o);
        model = m;
        fuelType = f;
    }

    void display() {
        super.display();
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Vechicleq3 {
    public static void main(String[] args) {
        Car s1 = new Car(378271, "Bhoomi", "BMW", "Petrol");
        s1.display();
    }
}