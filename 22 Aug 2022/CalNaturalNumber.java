/**
 * Program: Write a program to calculate the sum of first 10 natural number.
 * 
 * @author: Sonu Sharma
 * @date: 22 Aug 2022
 */

public class CalNaturalNumber {
    
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("sum of first 10 natural number = "+sum);

    }
}
