/*
Program : Print Negative elements of an array
@author : Sonu Sharma
@Date	: 15 Sep 2022
*/

public class NegativeArrayEle {

    static void negativeElements() {
        int arr [] = {1, -2, 6, -8, -12};
        for (int i : arr) {
            if (i < 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        negativeElements();
    }    
}