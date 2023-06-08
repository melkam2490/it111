import java.util.Scanner;

public class FurterExpanationDailySpecials {

    static Scanner scanner = new Scanner(System.in);
    static boolean isWeekend = true;
    static String day;
    static String coffee = "";
    static double price;

    public static void main(String[] args) {
        while (isWeekend) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only):");
            day = scanner.next();
            switch(day) {
                case "Saturday":
                case "Sunday":
                    System.out.println("Please enter a weekday, not a weekend!");
                    break;
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    handleCoffeeSpecial(day);
                    setCoffee();
                    break;
                default:
                    System.out.println("Invalid day!");
                    break;
            }
        }
        scanner.close();
    }

    public static void handleCoffeeSpecial(String day) {
        switch (day) {
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                isWeekend=false;
                break;
            case "Tuesday":
                coffee = "Frappe";
                price = 4.95;
                isWeekend=false;
                break;
            case "Wednesday":
                coffee = "Matcha";
                price = 3.95;
                isWeekend=false;
                break;
            case "Thursday":
                coffee = "Tea";
                price = 6.95;
                isWeekend=false;
                break;
            case "Friday":
                coffee = "Cappuccino";
                price = 6.95;
                isWeekend=false;
                break;
        }
    }

    public static void setCoffee() {
        double total;
        System.out.println(day + "'s coffee of the day is " + coffee + " and the price for 1 item is $" + price);
        System.out.println("How many " + coffee + " would you like to order?");
        int amount = scanner.nextInt();

        if (amount == 0) {
            System.out.println("Looks like you don't like " + coffee + ". So sad!!!");
        } else if (amount >= 1 && amount <= 4) {
            total = amount * price;
//
            System.out.println("Looks like you will be ordering only " + amount + " of " + coffee + " today! Your total amount will be: $" + String.format("%.2f", total));
        } else if (amount >= 5 && amount <= 9) {
            total = (amount * price) * 0.9;

            System.out.println("A group discount! Your price is $ " + price + " you have ordered " + amount+ " " +coffee+ " , but will pay only $" +String.format("%.2f", total));

        } else if ( amount>= 10){
            System.out.println("A bigger group discount! You have ordered " + amount + " of  " + coffee + ". Your regular price should be: " + String.format("%.2f",amount*price));

            total = (amount * price)  * 0.8;
            System.out.println("But will be charged  only: $ " +String.format("%.2f", total));
        } else {
            System.out.println("You have entered incorrect amount");
        }
    }
}



