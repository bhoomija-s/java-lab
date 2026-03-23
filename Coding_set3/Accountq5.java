class Account {
    int accNo;
    float balance;

    Account(int a, float b) {
        accNo = a;
        balance = b;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    float interestRate;
    int time;

    SavingsAccount(int a, float b, float r, int t) {
        super(a, b);
        interestRate = r;
        time = t;
    }

    float calculateInterest() {
        return (balance * interestRate * time) / 100;
    }

    void display() {
        super.display();
        System.out.println("Interest: " + calculateInterest());
    }
}

public class Accountq5 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(1001, 5000, 5, 2);
        s1.display();
    }
}