/*
Program: Oops Concept -> Anonymous object
@author: Sonu Sharma
@Date: 30 Aug 2022
*/

public class AnonymousDemo {
    
    long calFact(int num){
        long res = 1;
        int fact = num;
        while(fact > 0) {
            res *= fact;
            fact--;
        }
        return res;
    }

    public static void main(String[] args) {
        //AnonymousDemo obj = new AnonymousDemo();
        new AnonymousDemo().calFact(5); // anonymous object
    }
}
