
import java.util.Scanner;
public class Assignment2Selection24 {
    public static void main (String [] args){
        
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
            */

        // acordding to the flow chart frist we have to declear the value

        int totalCredits;
        Scanner input= new Scanner(System.in);
        // input the totalcredits
        totalCredits = input.nextInt();
        if (totalCredits >= 24) {
            System.out.println("Exceeds the lismits.");
        } else {
            System.out.println("KRS is Valid.");
        }


        // this is to much simple and esay to understand the if else statement and the ternary operator is good for the short logic and the if else is best for the complex cases.


    }
}
