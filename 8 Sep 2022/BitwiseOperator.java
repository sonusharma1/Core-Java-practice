/*
Program : bit wise operator 
@author : Sonu Sharma
@Date	: 8 Sep 2022
*/

class BitwiseOperator {

    public static void main(String[] args) {
        
        int a = 5, b = 7;

        System.out.println("AND "+(a & b));
        System.out.println("OR "+(a | b));
        System.out.println("XOR "+(a ^ b));
        System.out.println("Compliment ~a "+(~a));
        System.out.println("Compliment ~b "+(~b));
    }
}