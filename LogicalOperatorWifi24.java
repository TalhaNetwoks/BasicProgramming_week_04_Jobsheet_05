import java.util.Scanner;
public class LogicalOperatorWifi24 {
    public static void main(String[] args) {
        // import the scanner library 
        Scanner sc = new Scanner (System.in);
        // declare three boolean
        boolean isStudent, islecturer, isBlocked;
        // take input form the users for all three boolean
        System.out.println("Is the User a Student? (true/ false )");
        isStudent = sc.nextBoolean();
        System.out.println("Is the user a Lecturer? (true / false");
        islecturer = sc.nextBoolean();
        System.out.println("Is the usres account currently blocked? (true/ false");
        isBlocked = sc.nextBoolean();

        // now bulid the if --- else condation for the wifi access.
        if ((isStudent && islecturer) && !isBlocked) {
            System.out.println("Wifi access garanted");

        } else {
            System.out.println("Wifi access denide");
        }

       // The || (OR) operator checks whether the user is a student or a lecturer (or both) — it returns true if at least one role matches. The ! (NOT) operator reverses the value of isBlocked, so !isBlocked becomes true only when the user is not blocked. The && (AND) operator then combines both results — the user is only granted wifi access if both conditions are true at the same time: they hold a valid role (student or lecturer) and their account is not blocked. If either part is false — no valid role, or the account is blocked — the whole condition becomes false, and access is denied.

       // bcs the logical OR oporatoer is used for both if the student false the lacturer is true .

       // if we replace "&& insted of the ||" so if one of the condation false in the student and lecturer then it will give the false so the condation fail for geting the access. but this condaiton is not valid for the above senario bcs at the same time the one person can't be as student or lecturer.

       // in java the short circuit ecaluation act like if " ||" oporator is it then the java see the first value is true or not is yes then they evaluate it. and if its "&&" condaiton the java short circut oprator see if the frist value is false then they avaluate it false atoumaticaly. in the above condation if the student true then || result is true if the student false then it see the second value of lecturer then five the final result. if it true then && will see the another value if its true to the final resul is true other wise false.

       // if the ((isStudent || is lecturer) && !isBlocked) if the both of the value of student and lecturer is false. so the java short circuit ecaluation is if the frist part or value is false then java skip the rest part. and NOt isblocked value is true then give the final value of the false.

    }
    
}
