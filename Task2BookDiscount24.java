import java.util.Scanner;
public class Task2BookDiscount24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Declare the variables
        double bookPrice;
        int numberOfBooks;
        int typeOfBook;
        double discountPercentage = 0;
        double totalPayment;
        double totalDiscount;
        String nameOfDay;

        System.out.println("\t ----> wellcome to Our BookStore <----");
        System.out.print("\t Enter the name of the day (e.g., Monday, Tuesday, etc.): ");
        nameOfDay = input.next();
        System.out.print("\t Enter the Type of Book (1 = Dictionary, 2 = Novel, 3 = othertype): ");
        typeOfBook = input.nextInt();
        System.out.print("\tEnter the quantity of books you want to purchase: ");
        numberOfBooks = input.nextInt();
        System.out.print("\tEnter the price of the book: $ ");
        bookPrice = input.nextDouble();

        // Calculate the total payment before discount
           totalPayment = bookPrice * numberOfBooks;
           System.out.printf("\t Total payment before discount: $ %.2f%n", totalPayment); // disply only two dicimal points

         if (nameOfDay.equalsIgnoreCase("Wednesday")){
            if (typeOfBook == 1) {
                discountPercentage = 0.10;
                if (numberOfBooks > 2) {
                    discountPercentage += 0.02;
                }
            }else if (typeOfBook == 2) {
                discountPercentage = 0.07;
                if (numberOfBooks > 3) {
                    discountPercentage += 0.01;
                }
            } else if (typeOfBook == 3) {
                discountPercentage = 0.00;
                if (numberOfBooks > 5) {
                    discountPercentage += 0.05;
                }
            } else {
                System.out.println("Invalid book type.");
            }
        }

        // Calculate the total discount and final payment
        totalDiscount = totalPayment * discountPercentage;
        totalPayment -= totalDiscount;
        System.out.printf("\t Total discount: $ %.5f%n", totalDiscount); // only 5 decimal points
        System.out.printf("\t Final payment: $ %.2f%n", totalPayment);
}
}
