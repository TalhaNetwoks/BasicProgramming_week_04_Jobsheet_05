import java.util.Scanner;
public class AssignmentQueue24 {
    public static void main (String [] args){
// use the switch case to make the student serive counters

        Scanner input = new Scanner(System.in);
        System.out.println("----- Student Service Counters -----");
        System.out.println("Please select the service you need: ");
        System.out.println("1. Certification of Diplomas");
        System.out.println("2. Certificate of Enrollment");
        System.out.println("3. Tuition Fee Payment");
        System.out.print("4. Application for Academic Leave ");

        System.out.print("\nEnter your choice (1-4): ");
        int choice = input.nextInt();
        // switch case to make the student service counters
        switch (choice){
            case 1:
                System.out.println("You have selected Certification of Diplomas");
                break;
            case 2:
                System.out.println("You have selected Certificate of Enrollment");
                break;
            case 3:
                System.out.println("You have selected Tuition Fee Payment");
                break;
            case 4:
                System.out.println("You have selected Application for Academic Leave");
                break;
            default:
                System.out.println("Invalid choice. Serviece code is not avlible .");
        }

        

    }
    
}
