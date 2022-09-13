/*
Program : Find Factorial of a Number
@author : Sonu Sharma
@Date	: 13 Sep 2022
*/

public class FactorialDemo {

    static void calFactorial(int num) {
        long result = 1L;
        int facNum = num;
        while (num > 0) {
            result *= num;
            num--; 
        }
        System.out.println(facNum+"! = "+result);
    }

    static void calFactorial2(int num) {
        long result = 1L;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(num+"! = "+result);
    }

    public static void main(String[] args) {
        // calFactorial(30);
        calFactorial2(5);
    }
}
