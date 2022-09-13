/*
Program : Palindrome
@author : Sonu Sharma
@Date	: 13 Sep 2022
*/

public class PalindromeDemo {
    
    static void checkPalindrome(int num) {
        int remainder = 0, 
            reversedNumber = 0, 
            temp = num;

        while (num > 0) {
            remainder = num % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            num = num/10;
        }

        if (temp == reversedNumber) 
            System.out.println(temp+" is palindrome :)");
        else
            System.out.println(temp+" is not palindrome :(");
    }

    public static void main(String[] args) {
        checkPalindrome(Integer.parseInt(args[0]));
    }
}
