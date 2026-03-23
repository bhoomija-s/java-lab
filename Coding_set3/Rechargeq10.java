/*10. Mobile Recharge System
Create class Recharge with mobileNumber and planAmount.
Create subclass DataRecharge with dataLimit.
 Show recharge details and benefits.*/
 class Recharge {
    String mobileNumber;
    float planAmount;

    Recharge(String m, float p) {
        mobileNumber = m;
        planAmount = p;
    }

    void display() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan Amount: " + planAmount);
    }
}

class DataRecharge extends Recharge {
    String dataLimit;

    DataRecharge(String m, float p, String d) {
        super(m, p);
        dataLimit = d;
    }

    void display() {
        super.display();
        System.out.println("Data Limit: " + dataLimit);

        // Benefits
        if (planAmount >= 500) {
            System.out.println("Benefit: Unlimited Calls + Free OTT Subscription");
        } else {
            System.out.println("Benefit: Standard Data Pack");
        }
    }
}

public class Rechargeq10 {
    public static void main(String[] args) {
        DataRecharge r1 = new DataRecharge("9876543210", 599, "2GB/day");
        r1.display();
    }
}