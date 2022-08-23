/**
 * Program: abbreviation
 * 
 * @author: Sonu Sharma
 * @date: 22 Aug 2022
 */
public class Abbreviation {

    static void checkAbbrevation (String short_form){   // creating a method to print print the full form of Abbreviation
        
        switch (short_form) {
           
            case "asap"	-> System.out.println("As soon as possible.");
            case "lol"	-> System.out.println("laugh out loud.");
            case "omg"	-> System.out.println("Oh my God.");
            case "ttys"	-> System.out.println("Talk to you soon.");
            case "btw"	-> System.out.println("By the way.");
            default 	-> System.out.println("Abbreviation Not found");
        }
    }

    public static void main(String[] args) {
        
        checkAbbrevation((args[0]).toLowerCase()); // calling checkAbbrevation method and also taking input from user
    }
}