/**
Program:             
            If
            x = 2
            y = 5
            z = 0
            then find values of the following expressions:
            a. x == 2
            b. x != 5
            c. x != 5 && y >= 5
            d. z != 0 || x == 2
            e. !(y < 10)

@author: Sonu Sharma
@Date: 20 Aug 2022
 */

public class CalExpression {

    static void calculateExpression(){

        double x = 2, y = 5, z = 0;

        System.out.println(x == 2);
        System.out.println(x != 5);
        System.out.println(x != 5 && y >= 6);
        System.out.println(z != 0 || x == 2);
        System.out.println(!(y < 10));
    }
    
    public static void main(String[] args) {
        calculateExpression();
    }
}
