/*Car Details Using this Keyword
Create a class Car with attributes brand and price. Use the this keyword inside the
constructor to initialize the variables and display the details.*/

     class Car{
        String Brand;
        int price;
        Car(String b, int p){
           Brand=b;
           price = p;
        }
        Car(){
            this("unknown",0);
        }
        void display(){
            System.out.println("The brand of the Car is: "+ Brand);
            System.out.println("The price of the Car is: "+ price);
        }
    
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("BMW", 19090078);
        c1.display();
        c2.display();
    }
     }
