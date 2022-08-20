/**
Program: 
            A student will not be allowed to sit in exam if his/her attendence is less than 75%.
            Take following input from user
            Number of classes held
            Number of classes attended.
            And print
            percentage of class attended
            Is student is allowed to sit in exam or not.

            Allow student to sit if he/she has medical cause. Ask user if he/she has medical cause
            or not ( 'Y' or 'N' ) and print accordingly.

@author: Sonu Sharma
@Date: 20 Aug 2022
 */

public class AttendenceDemo {

    static void examEligiblity(int total_classes, int attend_classes, char med_cause ) {

        int attendence_percent = attend_classes * 100 / total_classes;

        if (attendence_percent > 75 || (attendence_percent < 75 && med_cause == 'y')) {                        
            System.out.println("You are allowed in Exam and your attendence is "+attendence_percent+"%");
        }
        else{
            System.out.println("You can not sit in the Exam");
            System.out.println("Because your attendence is "+attendence_percent+"%");
        }
    }

    public static void main(String[] args) {
        
        int total_class = Integer.parseInt(args[0]);
        int attend_class = Integer.parseInt(args[1]);
        char medical_cause = args[2].charAt(0); // to convert string to char

        examEligiblity(total_class, attend_class, medical_cause);
    }    
}