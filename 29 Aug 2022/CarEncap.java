
/*
Program: Oops Concept -> Encapsulation
@author: Sonu Sharma
@Date: 26 Aug 2022
*/

// creating a class which stores car info
class CarInfo {

    // creating instance variable
    String companyName, model;
    int hSpeed, milage;

    // initializing variables
    void inputDetails(String name, String mod, int speed, int mil){

        companyName = name;
        model = mod;
        hSpeed = speed;
        milage = mil;
    }

    // creating a method to print car Info
    void printCarInfo() {

        System.out.println("\nCompany Name : "+companyName);
        System.out.println("Model : "+model);
        System.out.println("Top Speed : "+hSpeed+"km/hr");
        System.out.println("Milage : "+milage+"km/Liter");
    }

}

public class CarEncap { 

    public static void main(String[] args) {
        
        // creating object of CarInfo class
        CarInfo c1 = new CarInfo();
        CarInfo c2 = new CarInfo();

        // Creating Instancess of 
        c1.inputDetails("MG","LOW",200,40);
        c2.inputDetails("Tata","TOP",350,50);
        
        // calling method
        c1.printCarInfo();
        c2.printCarInfo();
    }
}

