import java.util.Scanner;
public class AssignmentParking24 {
    public static void main (String [] args) {

    // use the if-ELSE case to make the car parking System, if the car is parked in the parking lot, it will be charged a fee, if not, it will be free.

    int parkingFee = 2000;
    int parkedHours;
    int moreHoures;

    Scanner input = new Scanner (System.in);

    System.out.print("\n ----- Salamt Datang to Malang Shopping Center parking lot ----- ");
    System.out.println("\n Please Enter the number of hours you car will be parked : ");
    parkedHours = input.nextInt();  

    // if more hours so the fee must be more then it 1000 RP for each hour, if less than 2 hours so the fee is free.

      if (parkedHours > 2 ){
        moreHoures = ((parkingFee) + ( parkedHours - 2) * 1000);
        System.out.println(" \tyour car is parked for the "+ parkedHours+" hours");
        System.out.println ("\tSo, your parking fee is Rp. "+ moreHoures);
    }  else 
    {
        System.out.println(" \tyour car is parked for the "+ parkedHours+" hours");
        System.out.println("\tSo, your parking fee is Rp. 0");
    }

    }
    
}
