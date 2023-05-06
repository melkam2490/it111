import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many beverages do you want to order? ");
        int numBeverages = input.nextInt();

        double totalPrice = 0.0;
        for (int i = 1; i <= numBeverages; i++) {
            System.out.print("Enter the price of beverage " + i + ": $");
            double price = input.nextDouble();
            totalPrice += price;
        }

        System.out.println("You ordered " + numBeverages + " beverages, and the total price is $" + totalPrice);
    }
}