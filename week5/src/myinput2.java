import java.util.Scanner;

public class myinput2 {

    public static void main( String[]args){

        String name, meassage;
        int age;
        double salary;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your first name please!");

        name = myObj.next();

        System.out.println(name+", Please enter your age!");

        age = myObj.nextInt();

        System.out.println(name+", last but least, your annual salary!");

        salary = myObj.nextDouble();
        if (salary<50000) {
            meassage = "I need another job, or roomate" ;
        } else if(salary >= 50000 && salary <60000){
            meassage = " not bad,but hard to survive in Seattle" ;

        }

        else if ((salary >= 60000 && salary <70000)){
            meassage = "salary is getting better";

        } else if((salary >= 70000 && salary <80000)){
            meassage = "Almost livable in Seattle.";

        }
        else  {
            meassage = " Life is good!";

        }

        System.out.println("First name:" +name);
        System.out.println("Age:" +name);

        System.out.println("Salary:" +name);
        System.out.println("Message:" +meassage);






    }

}
