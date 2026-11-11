import java.util.Scanner;

public class SelectionIf24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Print KRS SIAKAD-----");
        System.out.println("Has the UKT been Paid?  (true/false): ");
        boolean uktpaid = sc.nextBoolean();
        
        // now we have to apply the condition if the uktpaid is true or false
        if (uktpaid) {
            System.out.println("UKT payment Verified");
            System.out.println("Please print your KRs and ask your DPA to sign it");
        }

        //1. inside the IF block we enter the condition if the uktpaid as boolean so, if the urse input data is true the the program will print the massage inside the IF block (both line will be pritn).we put the boolean variable inside the IF block. so oIF bock execute only if the condition is true. if the condition is false then the IF block will not execute and the program will not print the massage inside the IF block.

        // 2. inside the ELSE block we enter the condition if the uktpaid as boolean so, if the urse input data is false the then the program will print the massage inside the ELSE block (both line will be pritn).we put the boolean variable inside the ELSE block. so ELSE bock execute only if the condition is false. if the condition is true then the ELSE block will not execute and the program will not print the massage inside the ELSE block.

        //3. if we try to run the program using the input "TRUE" isted of "true" the program in my laptop is still running and it print the massage inside the IF block. and the other when i gives the "yes" so it gives me the error massage "Exception in thread "main" java.util.InputMismatchException" and the program is not running. so we have to give the input as "true" or "false" only. bcs of the boolean data type. if we give the input as "yes" or "no" the program will not run and it will give the error massage. so we have to give the input as "true" or "false" only.

        else {
            System.out.println("UKT payment not verified");
            System.out.println("Reistration rejected. Please pay your UKT first");
        }

        //4. the above is the example of the IF ELSE block. if the condition is true then the IF block will execute and if the condition is false then the ELSE block will execute. so we can say that the IF ELSE block is used to check the condition and execute the block of code based on the condition.

    }
        
}
