package package_person;

public class HomeworkPersonDetails {
    public static void main(String[] args){
        double adjustedRate =0;
        double monthlyRate = 0;
        double carAgeRate = 0;
        String car;


       // In creating process of creating an object from my clas
        HomeworkPerson firstPerson = new HomeworkPerson();
        //Different way to create instance from the customized constructor
        HomeworkPerson secondPerson = new HomeworkPerson("Kendall Black", 22, 2019, true, 570.0 );
        HomeworkPerson thirdPerson = new HomeworkPerson();
        secondPerson.carName= "Mustang";

       thirdPerson.name=" Arial";
       thirdPerson.gender='F';
       thirdPerson.age = 54;
       thirdPerson.carAge= 2016;
        thirdPerson.violations= true;
       thirdPerson.creditScore = 600;
       thirdPerson.carName ="Lexus";



        //Another way to create instance from the default constructor
        firstPerson.name=" Cathy Jones";
        firstPerson.carName=" Volksagon Bag ";
        firstPerson.age = 33;
        firstPerson.carAge = 2010;
        firstPerson.violations= false;
        firstPerson.creditScore = 690;

        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ " ; " +firstPerson.getRate(monthlyRate) +" dollars");
        System.out.println("Adjustment: " +firstPerson.assumeGender(monthlyRate) +" dollars");
        System.out.println("here is " +firstPerson.name+" 's total monthly premium: ");
//        System.out.println(firstPerson.assumeGender(adjustedRateRate +firstPerson.getRate(monthlyRate)));
        System.out.println("Your insurance premium is : " +firstPerson.getRateAge(carAgeRate) +" dollars");

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ " ; " +secondPerson.getRate(monthlyRate) +" dollars");
        System.out.println("Adjustment: " +secondPerson.assumeGender(monthlyRate) +" dollars");
        System.out.println("Your insurance premium is : " +secondPerson.getRateAge(carAgeRate) +" dollars");

        System.out.println();

        thirdPerson.display();
        System.out.println("Your car name " +thirdPerson.carName);
        System.out.println("Preliminary Rate for " +thirdPerson.name+ " ; " +thirdPerson.getRate(monthlyRate) +" dollars");
        System.out.println("Adjustment: " +thirdPerson.assumeGender(monthlyRate) +" dollars");

//
//        System.out.println("Your premium insurance: " +thirdPerson.getRateAge(carAgeRate) +" dollars");
//

    }
}
