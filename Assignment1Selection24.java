import java.util.Scanner;
public class Assignment1Selection24 {
    public static void main (String [] args ) {
        Scanner input = new Scanner (System.in);

        System.out.println("----- Print KRS SIAKAD ----");
        System.out.println("Has the UKT been paid? (true /false) ");
        boolean uktpaid = input.nextBoolean();

        // tarnory oporetor 
        String massage = (uktpaid)? "UKT payment is verified. please aske your DPA and sing your KRS form him" : " please do your KRS payments first";
        System.out.println(massage);

        input.close();
// according to my opinon the tarnory oporatoer is good for the short logic and the if elas is best for the complax cases.


    }
}