import  java.util.Scanner;
public class NestedThesisExam24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String massage;
        System.out.println("Has the Student cleared all penalties ? (Yes /No) ");
        String noPenalty = sc.nextLine().trim();

        //  the "trim()" here uesed for the removing leading and trailing spaces form the String

        // now get the input form users about the guigance session with first and second supervisor

        System.out.println("Enter the total number of the sessions with Supervisors 1 : ");
        int guidanceCOunt1 = sc.nextInt();
        System.out.println("Enter the total number of sessions with supervisors 2 :");
        int guidanceCount2 = sc.nextInt();

        // now used the nested If 

        if (noPenalty.equalsIgnoreCase("yes")) {
             if (guidanceCOunt1 >= 8 && guidanceCount2 >= 4) {
                massage = "All the reqirments met. The Student may ragister for the theseis exam! ";

             } else if ( guidanceCOunt1 < 8 && guidanceCount2 < 4) {
                massage = " Faild! the Guidance session with Supervisor 1 are bwlow then 8 and Supervisor 2 are below then 4";

             } else if (guidanceCOunt1 <8){
                massage = "Failed! Guidance session with Supervisor 1 have not reached 8";
             } else {
                massage = "Failed! Guidance session with Supervisor 2 have not reached 4";

             }

        } else {
            massage = "Failed! the student Still have and outstanding penalty  ";
        }
        System.out.println(massage);
// if the student enter the "no" the program still getting the input form the urses and also it will exicute the program but the the condation will exicute directly about the " failed massage" rather if the usres gives the input value of the Supervisor 1 and 2 more the or equal to 8 and 4.

// in the frist condtion "if (guidanceCount1 >= 8 && guidanceCount2 >= 4" mean the inatianl condation for the nested if. if one of them not meat the condation the it will goes directly to the final else condation and print the "massage",.

// Flow of the program
/*
1---> Assing the value of the String and store it in String
2--->  get the input form the student that he clear all penalties or not
3---> get the input form the urse about the spuervisor 1 and 2  total meeting.
4----> apply the nasted if  
   a---> if the noperalty is clear then goes for the second if conditon insied the nasted if conditons 
   b---> and the they apply and check the condition of the meeting with Supervisores
   c---> if one of them is less then the required then it will print the messing massage for it.
   d---> this one is for the last massage if the student is penaolty then the elas condition will directly exicute
   
   e---> still confues about the last simple out put of the println massage*/

    }
    
}
