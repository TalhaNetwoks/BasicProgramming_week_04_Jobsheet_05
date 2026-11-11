import java.util.Scanner;

public class SelectionIfElse24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Print KRS SIAKAD-----");
        System.out.println("Enter your Current Semester :");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS for Semester 1 is Displayed");
        } else if (semester == 2) {
            System.out.println("KRS for Semester 2 is Displayed");
        } else if (semester == 3) {
            System.out.println("KRS for Semester 3 is Displayed");
        } else if (semester == 4) {
            System.out.println("KRS for Semester 4 is Displayed");
        } else if (semester == 5) {
            System.out.println("KRS for Semester 5 is Displayed");
        } else if (semester == 6) {
            System.out.println("KRS for Semester 6 is Displayed");
        } else if (semester == 7) {
            System.out.println("KRS for Semester 7 is Displayed");
        } else if (semester == 8) {
            System.out.println("KRS for Semester 8 is Displayed");
        } else {
            System.out.println("Invalid Semester");
        }
    }
}
