/**
 * Program: Write a program that prompts the user to input a positive integer. 
 *          It should then print the multiplication table of that number. 
 * 
 * @author: Sonu Sharma
 * @date: 22 Aug 2022
 */

public class CalTable {

    static void PrintTable(int num) {

        for (int i = 1; i <= 10; i++) {
            
            System.out.println(num * i);
        }
    }
    
    public static void main (String[] args) {
        
        int num = Integer.parseInt(args[0]);  
        PrintTable(num);                       
    }
}
