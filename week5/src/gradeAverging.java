import java.util.Scanner;

public class gradeAverging {
    public static void main(String[]args){
        int counter =1;
        int grade;
        double total = 0;
        double average;
        Scanner input = new Scanner(System.in);
        // our while loop will count how many times we are asking the end user to input a grade.

        while (counter <=5 ){
            System.out.println("Please enter your" +counter+  " numerical grade!");
            grade=input.nextInt();
            total +=grade;
            counter+=1;
        }
        String message;
        char letterGrade;
        counter-=1;
        average = total/counter;
        System.out.println("You have earned at average grade of " +average );

        if(average>=90 && average <=100){
            letterGrade='A';
            message =" Excellent Work! ";

        } else if (average>=80 && average < 90) {
             letterGrade='B';
             message =" Solid Work! ";
        } else if (average>=70 && average < 80){
             letterGrade='C';
             message ="More Studing nessary!";

        }else if (average>=65 && average < 70) {
             letterGrade='D';
             message ="sqeake by!";

        }else{
            letterGrade='F';
            message ="Note a passing grade!!";
        }
         System.out.println("you are eadned the following letter grade " +letterGrade+ " , and here is the message " +message);
    }


}









