public class MyATM {

    public static void main(String[]args){

        int withdrawal, amount;
        withdrawal = 25;
        amount= 200;
        while( amount !=0){

            amount-=withdrawal;
                    amount= amount-withdrawal;
            System.out.println(amount);}
        System.out.println("your present amount after withdrawal is " +amount+"");


        if (amount==0){
            System.out.println("You have no money!!");
        }
        else {
            System.out.println("Your present money is " +amount+ "dollars");

        }
    }



    }
