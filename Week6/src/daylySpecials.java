import java.util.Scanner;

public class daylySpecials {
    public static void main(String[]args){
       String specials="";
       int numbers;



        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a day of the week excluding weekends(Monday - Friday only!");
        specials = input.next();

        String coffee;
        double price;
        int amount;
        double total;
        boolean saturday= specials.equals("Saturday");
        boolean sunday= specials.equals("Sunday");
        if(saturday || sunday) {
            System.out.println("please enter a weekday, not weekends!");
            specials = input.next();
        }

//
        switch (specials) {
            case "Monday" -> {
                coffee = "latte";
                price = 4.95;


                System.out.println(specials + "s cofee of the day is " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + " would you like to order?");
                numbers = input.nextInt();

                System.out.println("Looks like don't like" + coffee + "! so sad!!!");

            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 4.95;
                System.out.println(specials + "s cofee of the day is a "  +coffee + " and the price will be $" + price);
                System.out.println("How many " +coffee+ " would you like to order?");
                //reading the amount how many
                numbers= input.nextInt();
                if (numbers <=0) {
                    System.out.println("Looks like you don't like Latte! so sad!!!");
                }
                else if (numbers == 1) {
                        System.out.println("Looks like you will be ordring only  " + numbers + " " + coffee + " today!");
                }
                else{
                    total = numbers * price;
                    System.out.printf(numbers + " " +coffee + " have been orderded totaling  $%.2f ", total);
                }

                }


            case "Wendsday" -> {
                coffee = "Macha";
                price = 3.95;
                System.out.println(specials + "s cofee of the day is " + coffee + " and the price will be $" + price);
            }
            case "Thrsday" -> {
                coffee = "Tea";
                price = 6.95;
                System.out.println(specials + "s cofee of the day is " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Capuuchno";
                price = 6.95;
                System.out.println(specials + "s cofee of the day is " + coffee+ " and the price will be $" + price);
            }
        }

    }
}
