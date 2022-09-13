/*
Program : If Else -> checking a character and printing its ascii value
@author : Sonu Sharma
@Date	: 12 Sep 2022
*/
public class CheckCharacter {
    
    static void checkChar(char enteredChar) {
        int asciiValue = enteredChar;

        // checking for number
        if (asciiValue >= 48 && asciiValue <= 57) {
            System.out.println(enteredChar+" is a Number and ASCII value is : "+asciiValue);
        }
        // checking for upper case value
        else if (asciiValue >= 65 && asciiValue <= 90) {
            System.out.println(enteredChar+" is a UpperCase and ASCII value is : "+asciiValue);
            if (enteredChar == 'A' || enteredChar == 'E' || enteredChar == 'I' || enteredChar == 'O' || enteredChar == 'U') {
                System.out.println("and "+enteredChar+" is Vovel");
            }
        }
        // checking for lower case value
        else if (asciiValue >= 97 && asciiValue <= 122) {
            System.out.println(enteredChar+" is a LowerCase and ASCII value is : "+asciiValue);
            if (enteredChar == 'a' || enteredChar == 'e' || enteredChar == 'i' || enteredChar == 'o' || enteredChar == 'u') {
                System.out.println("and "+enteredChar+" is Vovel");
            }
        }
        // if none of above then it is a special char
        else {
            System.out.println(enteredChar+" is a Special Character and ASCII value is : "+asciiValue);
        }
    }

    static void printChar(int asciiNum){
        // to print original character of asciiNum/Decimal
        System.out.println("Character for "+asciiNum+" is "+(char) asciiNum);
    }

    public static void main(String[] args) {
        char enteredChar = args[0].charAt(0);
        int asciiNum = Integer.parseInt(args[1]);

        checkChar(enteredChar);
        printChar(asciiNum);
    }
}
