/*
Program : Patterns
@author : Sonu Sharma
@Date	: 13 Sep 2022
*/
public class Pattern {

    static void printPattern1(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printPattern2(int num) {

        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // second way of printPattern2
    static void printPattern3(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        //printPattern1(num);
        printPattern2(num);
        printPattern3(num);
    }
}
