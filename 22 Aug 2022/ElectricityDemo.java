/**
 * Program: WAJP to input electricity unit charge and calculate the total bill according to given condition:
 *          For first 50 units -> 0.50 rs/unit
 *          For Next 100 units -> 0.75 rs/unit
 *          For Next 100 units -> 1.2 rs/unit
 *          For Unit above 250 units -> 1.5 rs/unit
 * 
 *          An additional surcharge of 20% is added to the bill.
 * 
 * @author: Sonu Sharma
 * @date: 22 Aug 2022
 */

public class ElectricityDemo {

    // Its a method to calculate Bill
    static void calEBill(int bill_units) {

        double bill_to_pay = 0;

        // if bill's units > 250 it will run
        if (bill_units > 250) {
            
            bill_to_pay += (bill_units - 250) * 1.5;
            bill_to_pay += 220; //(100 * 1.2) + (100 * 0.75) +(50 * 0.5)

            System.out.println("You have to pay "+(bill_to_pay * 120 / 100)+"rs.");
        }
        
        // if bill's units <= 250 it will run
        else if (bill_units <= 250) {
            
            // if bill's units <= 50 it will run
            if (bill_units <= 50) {                
                System.out.println("You have to pay "+(bill_units * 0.5 * 120 / 100)+"rs.");
            }

            //if bill's units between 51 - 150 it will run
            else if (bill_units > 50 && bill_units <= 150) {
                bill_to_pay += 25 + (bill_units - 50) * 0.75 ;
                System.out.println("You have to pay "+(bill_to_pay * 120 / 100)+"rs.");
            }

            //if bill's units between 151 - 250 it will run
            else if (bill_units > 150 && bill_units <= 250) {
                bill_to_pay += 100 + (bill_units - 150) * 1.2;
                System.out.println("You have to pay "+(bill_to_pay * 120 / 100)+"rs.");
            }
        }
        
    }

    public static void main (String[] args) {
        
        int units = Integer.parseInt(args[0]);  // takes bill units using command line argument
        calEBill(units);                        // calling calEBill method
    }
}