/*. Library Management
Create class Book with title and author.
Create subclass IssuedBook with issueDate and returnDate.
 Display issued book details.*/
 class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class IssuedBook extends Book {
    String issueDate;
    String returnDate;

    IssuedBook(String t, String a, String i, String r) {
        super(t, a);
        issueDate = i;
        returnDate = r;
    }

    void display() {
        super.display();
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}

public class Bookq9 {
    public static void main(String[] args) {
        IssuedBook b1 = new IssuedBook(
            "The Alchemist",
            "Paulo Coelho",
            "20-03-2026",
            "30-03-2026"
        );

        b1.display();
    }
}