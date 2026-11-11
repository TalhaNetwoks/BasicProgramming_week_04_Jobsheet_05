import java.util.Scanner;
public class Task2AssistantSelection24 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        // first i have to assing the variables 

    boolean avtiveStudent;
    double gradsBP;
    boolean certificatePogrammingCompetency;
    int interviewScore;

    System.out.println("\tEnter the student status (true for active, false for inactive): ");
    avtiveStudent = input.nextBoolean();
    System.out.println("\tEnter the Grads in Basic Programming (0 - 100): ");
    gradsBP = input.nextDouble();
    System.out.println("\tEnter the certificate status for Programming Competency (true for yes, false for no): ");
    certificatePogrammingCompetency = input.nextBoolean();
    System.out.println("\tEnter the interview score (0 - 100): ");
    interviewScore = input.nextInt();

    // now i have to use the Nasted if else statement to check the conditions for the student selection

    // also i will show the reson for the failure stage of the student selection
   /*  if (avtiveStudent) {
        if (gradsBP >= 80 && certificatePogrammingCompetency) {

            if (interviewScore >= 75) {
                System.out.println("The student is selected for the program.");
            } else {
                System.out.println("The student is not selected due to low interview score.");
            }
                

    } else {
        System.out.println("The student is not selected due to inactive status.");
} }*/

         if (avtiveStudent) {
            if (gradsBP >= 80 && certificatePogrammingCompetency) {
                if (interviewScore >= 75) {
                    System.out.println("The student is selected for the program.");
                } else {
                    System.out.println("The student is not selected due to low interview score.");
                }
            } else {
                System.out.println("\t ---- SOORY ! The student is not selected due to insufficient grades or missing certificate.------");
            }
        } else {
            System.out.println("\t ---- SOORY ! The student is not selected due to inactive status.------");
        }
    }
}

    

