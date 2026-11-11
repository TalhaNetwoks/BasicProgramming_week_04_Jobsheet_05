import java.util.Scanner;
public class IfNested {
    
     public static void main (String [] args ) {

        // i am going to do some prectious on nested if statements
        Scanner input = new Scanner (System.in);
        // Scanner input = new Scanner (System.in); this was just a call for takeing the input form the users 

          System.out.println(" \n --- Pleae Enter you Score and Attandance ----");
        // grade clasifier 
        System.out.println("\n \t Did the Student meet the attendance requirements? (true / false): ");
         //boolean subjectPassStatus;
         boolean subjectPassStatus = input.nextBoolean();
        System.out.println(" \t Enter your Score (0-100) : ");
         int score = input.nextInt();

         if (subjectPassStatus){
            if (score >=100){
                System.out.println("\tEntered the invalied score: ");
            }
             else if ( score >= 90 ) {
                System.out.println ("\t Grade : A");
            } else if (score >= 75) {
                System.out.println ("Grade : B");
            } else if (score >= 33){
                System.out.println(" Grade : C ");
            }
            else if (score >= -10 ){
                System.out.println("Grade : Fail ");
            } 
         } else {
            System.out.println(" Fail - Insufficient attendance ");
         }
     }
}
