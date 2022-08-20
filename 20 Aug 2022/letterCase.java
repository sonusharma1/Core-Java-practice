/**
Program: Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
@author: Sonu Sharma
@Date: 20 Aug 2022
 */

public class letterCase {
    
    public static void main(String[] args) {

        char entered_letter = args[0].charAt(0);
        int ascii = entered_letter;

        if (Character.isLowerCase(entered_letter))
            System.out.println(entered_letter+" is Lower Case and ASCII value = "+ascii);
        else
            System.out.println(entered_letter+" is Upper Case and ASCII value = "+ascii);

    }
}
