import java.util.Scanner;
public class NestedLabAccess024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // declare the variables 
        boolean isActiveStudent, isSanctionde, hasLecturerPermit, isLabAssistant ;

        // get the input form the users 

        System.out.println("\tEnter your current status are you Active Student now : (true/ false) ");
        isActiveStudent = sc.nextBoolean();
          System.out.println("\tEnter your current status are you sanctioned now : (true/ false) ");
        isSanctionde= sc.nextBoolean();
          System.out.println("\tEnter your current status are you Lectures permit now : (true/ false) ");
        hasLecturerPermit = sc.nextBoolean();
          System.out.println("\tEnter your current status are you Lab Assistant now : (true/ false) ");
        isLabAssistant = sc.nextBoolean();

        // apply the nasted if condaiton 

        if (isActiveStudent && !isSanctionde) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access garanted");
            } else {
                System.out.println("Access Denied: lecturer permsiison or lave assistant status required ");
            }
        }else {
            System.out.println("Access desnid: student does not meet the requirment");
        }

        // the has lecturer and lab Assistant is plaed inside the frist if bcs we want to know if the student get the permsion access form the one of condation from it or not if yes then the result is evaluated. other wise not. this is enter the frist if of nestaed bcs we want to confrim frist the student is active or seconited 
        
        //the funcation of && , || , ! operatoes in this program is to get the natiianl statues of student is it active or not and if true. then if he is secctioned aslo then the NOT oparator chane it. ||  is used for the permission of the lab access if he have the one value true then then nested if condation will exicute.

        // yes it will work the same but the issue here in the quesation they asked us about to use the nestead if condation.

        //Nested if lets you show different denial messages depending on where the failure happens — a single combined condition can only say "access denied" with no detail on why. The nested structure has a separate else at each level, so it can distinguish "not eligible" from "missing permission."

        /*
        Denied at 1st level (outer fails):
isActiveStudent = false
isSanctioned = false
hasLecturerPermit = true
isLabAssistant = false

→ Output: "Access denied: student does not meet the requirement"
(inner if never runs, since outer already failed)

Denied at 2nd level (outer passes, inner fails):
isActiveStudent = true
isSanctioned = false
hasLecturerPermit = false
isLabAssistant = false

→ Output "Access Denied: lecturer permission or lab assistant status required"
(outer passes, but neither permit condition is true) */

    }
    
}
