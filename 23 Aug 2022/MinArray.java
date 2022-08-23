/*
Program: Find the minimum number from the list of numbers
@author: Sonu Sharma
@Date: 23 Aug 2022
*/

public class MinArray {
    
    static void minNumber(){

        int [] myArray = {25, 65, 21, 89, 32};
        int minNum = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (minNum > myArray[i]) {
                minNum = myArray[i];
            }
        }
        System.out.println("Minimum Number = "+minNum);
    }

    public static void main(String[] args) {
        minNumber();
    }
}
