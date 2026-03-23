/*. Food Delivery System
Create class Order with orderId and amount.
Create subclass OnlineOrder with deliveryCharge.
 Calculate final bill using super.*/
 class Order {
    int orderId;
    float amount;
    Order(int o, float a){
        orderId = o;
        amount = a;
    }
    void display(){
        System.out.println("OrderId: " + orderId);
        System.out.println("Amount: " + amount);
    }
 }
 class OnlineOrder extends Order{
      float deliveryCharge;
      OnlineOrder(int o, float a, float d){
        super(o,a);
        deliveryCharge = d;
      }
      float TotalCharge(){
         return amount + deliveryCharge;
      }
      void display(){
        super.display();
         System.out.println("Total Charges: " +TotalCharge() );
      }
 }
 public class Orderq8{
    public static void main(String [] agrs){
        OnlineOrder s1 = new OnlineOrder(241,24000,241);
        s1.display();

    }
 }