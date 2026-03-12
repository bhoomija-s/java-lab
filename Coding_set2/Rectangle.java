/*Rectangle Area
Create a class Rectangle with length and width. Use a parameterized constructor to
initialize the values and write a method to calculate and display the area*/
 
class Rectangle{
     int length;
     int width;

 Rectangle(int l, int w){
    length =l;
    width =w;
 }
 int calculate(){
    int area;
    area = length*width;
    return area;
 }
 void display(){
    int area = calculate();
    System.out.print("Area od Rectangle: "+ area);
 }
 
 public static void main(String[] args){
    Rectangle r = new Rectangle(67,8);
    r.calculate();
    r.display();
 }
}