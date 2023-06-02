package package_person;

public class HomeworkPerson {
    String name;
    char gender;
    int age;
    int carAge;
    boolean violations;
    double creditScore;
    String carName;

   public HomeworkPerson(){
   }
    public HomeworkPerson(String n, int a, int cA, Boolean v, double cr){
        this.name = n;
        this.age = a;
        this.carAge = cA;
        this.violations = v;
        this.creditScore = cr;
    }


    public void setGender(char g){
        this.gender = g;
    }

    public char getGender(){
        return this.gender;
    }

    public void display(){
        System.out.println("Your Name: " + this.name);
        System.out.println("Your Age : " + this.age);
        System.out.println("Your Car Name: " +this.carName);
        System.out.println("Your Car year : " + this.carAge);
        System.out.println("Your Credit Score: " + this.creditScore);
        System.out.println("Your Violation: " + this.violations);
    }

    public double getRateAge(double carAgeRate){
        if (this.carAge<=2010){
            carAgeRate= 200.00;
        }
        else {
            carAgeRate = 800.00;
        }
        return carAgeRate;
    }



    public double getRate( double monthlyRate){
        if (this.violations == true && this.creditScore<= 700){
            monthlyRate = 500.00;

        }
        else {
            monthlyRate= 100.00;
        }
        return monthlyRate;


    }
    public double assumeGender( double adjusteRate){
        if (this.gender== 'M' && this.age<=25){
            adjusteRate = 100;
        }
        else { adjusteRate =0;

        }
        return adjusteRate;

    }


}

