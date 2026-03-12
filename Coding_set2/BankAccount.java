/* Bank Account Simulation 
Create a class BankAccount with attributes accountHolderName and balance. Use a 
constructor to initialize them and implement a method to deposit money and 
display the updated balance.*/
class BankAccount{
    String accountHolderName;
    float balance;
   BankAccount(String acc, Float b){
    accountHolderName = acc;
    balance =b;
   }
   void deposit(int money){
    balance+=money;
   }
   void display(){
    System.out.println("Name of the Account Holder: "+accountHolderName);
    System.out.println("Balnce of the Account: "+ balance);

   }
   public static void main(String[] args){
    BankAccount b1=new BankAccount("Brutus",99999.9f);
    b1.display();
    b1.deposit(100);
    b1.display();
   }
}