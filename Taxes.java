
public class Taxes {

    public static void main(String[] args) {
        double income = 100;

        double taxRate = 0.00;
        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else if (income >= 2500) {
            taxRate = 0.30;
        }
        System.out.println("your weekly income is: $" + income);
        System.out.println("Your tax rate is: " + taxRate);
        System.out.println("Weekly tax withheld: $" + (income * taxRate));
    }
}
