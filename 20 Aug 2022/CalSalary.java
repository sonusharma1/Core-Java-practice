/*
Program: 
            A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
            Ask user for their salary and year of service and print the net bonus amount.

@author: Sonu Sharma
@Date: 20 Aug 2022
*/

public class CalSalary {

    static void checkBonus(int emp_years, int emp_salries) {

        if (emp_years > 5) {

            System.out.println("Your Bonus = "+emp_salries/20);
        }
        else{
            System.out.println("You are not eligible");
        }
    }

    public static void main(String[] args) {

        int emp_sal = Integer.parseInt(args[0]);
        int emp_year = Integer.parseInt(args[1]);

        checkBonus(emp_year, emp_sal);
    }
}
