/*
Program : Ternary Operator
@author : Sonu Sharma
@Date	: 13 Sep 2022
*/

public class TernaryOperatorDemo {
	
	static void evenOdd(int num) {
        String result;
        result = (num % 2 == 0)? "even" : "odd";            // syntax for ternary operator
        System.out.println(num+" is "+result+" number");
    }
    
    public static void main(String[] args) {
        evenOdd(6);
    }
}
