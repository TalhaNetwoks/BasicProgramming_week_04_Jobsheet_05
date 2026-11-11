import java.util.Scanner;
public class SelectioSwitch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Print KRS SIAKAD-----");
        System.out.println("Enter your Current Semester :");

        int semester = sc.nextInt();
        switch (semester) {
            case 1:
                System.out.println("KRS for Semester 1 is Displayed");
                break;
            case 2:
                System.out.println("KRS for Semster 2 is Displayed");
                break;
            case 3:
                System.out.println("KRS for Semester 3 is Displayed");
                break;
            case 4:
                System.out.println("KRS for Semester 4 is Displayed");
                break;
            case 5:
                System.out.println("KRS for Semester 5 is Displayed");
                break;

                //1. if i delete the "break;" from the case 5 then the will not stop it will jump to the next case 6 and it will be executed and then the program will stop. so we have to put the "break;" after each case so that the program will stop after executing the case. the funcation of break is to stop the program after executing the case. and the changes is now done as it was before.

                // 2. with the input of "10 and 0" the program will print the "Invalid Semester" bcs its not in the range or 1 - 8. so base on the result the role of the default is to print the result you want to print if the input is not in the range of the case. so the default is used to print the result if the input is not in the range of the case.
                
                //3. when i change the data type of the variable semester from int to double it gives the error massage case constants in a switch on 'double' are not of type 'double'. so we have to change the data type of the variable semester from double to int. so the changes is now done as it was before. and the data types that can be used in the switch statement are byte, short, char, int, String and enum types. so we have to use the data type of the variable semester as int.
                
                //4. we can check this answer in the file name "SelectionIfElse24.java".
                
            case 6:
                System.out.println("KRS for Semester 6 is Displayed");  
                break;
            case 7:
                System.out.println("KRS for Semester 7 is Displayed");
                break;
            case 8:
                System.out.println("KRS for Semester 8 is Displayed");
                break;
                default:
                System.out.println("Invalid Semester");


        }
    }
}
