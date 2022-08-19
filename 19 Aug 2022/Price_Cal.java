/*
Program: 
            A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
            Ask user for quantity
            Suppose, one unit will cost 100.
            Judge and print total cost for user.

@author: Sonu Sharma
@Date: 17 Aug 2022
*/

public class Price_Cal {
    
    static void discountCalculator(int product_quantity){

        int one_quantity_price = 100;       // Price of one quantity
        if (product_quantity > 1000) {
            System.out.println("Final Price = " +(one_quantity_price * product_quantity)*90/100);  // To print discounted price
        }
        else {
            System.out.println("Final Price = "+(one_quantity_price * product_quantity));
        }
    }

    public static void main(String[] args) {
        
        int pro_quantity = Integer.parseInt(args[0]);
        discountCalculator(pro_quantity);
    }
}
