import java.util.Scanner;
public class SelectionAttendance264107020089 {
    public static void main(String[] args) {

        Scanner input = new  Scanner(System.in);
        System.out.println("-----Print KRS SIAKAD-----");
        System.out.println("Has the UKT been Paid?  (true/false): ");
        boolean uktpaid = input.nextBoolean();

         String massage = (uktpaid) ?"UKT payment Verified. Print your KRS and then Sing it from DPA" : "Registration rejectied. please pay your UKT frist";

         System.out.print(massage);




        
    }
}
