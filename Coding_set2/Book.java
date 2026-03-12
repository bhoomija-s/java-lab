/*Book Class with Constructor Overloading
Create a class Book with attributes title and price. Implement two constructors:
one default constructor and one parameterized constructor. Display the book
details.*/
c Book{
        String Title;
        int price;
        Book(){
            Title = "NULL";
            price=0;
            System.out.print("Default constructor ");
        }
        Book(String t, int p){
            Title = t;
            price = p;
             System.out.print("\n not Default constructor \n");
        }
        void display(){
            System.out.println("The Title of the Book is: "+ Title);
            System.out.println("The Price of the Book is: "+ price);
        }

    
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("The diary of the Young Girl",200);
        b2.display();
        b1.display();

    }
}