/*Online Shopping – Product System
Create class Product with name and price.
Create subclass Electronics with warrantyPeriod.
 Display product details and final price.*/
 class Product{
    String name;
    int price;
    Product( String n, int p){
        name = n;
        price = p;
    }
    void display(){
        System.out.println("Name :"+ name);
        System.out.println("price: "+ price);
    }
 }
 class Electronics extends Product{
    String Warrentyperid;
    Electronics(String n, int p, String wp){
        super(n,p);
        Warrentyperid = wp;

    }
    void display(){
        super.display();
        System.out.println("warrenty period"+ Warrentyperid);
    }
 }
 public class Productq4{
    public static void main(String[] args){
    Electronics s1 = new Electronics( "bhoomi",200000, " 3 years");
    
    s1.display();
 }
 }
 
