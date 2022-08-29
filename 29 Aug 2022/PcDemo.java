/*
Program: Oops Concept -> Encapsulation
@author: Sonu Sharma
@Date: 29 Aug 2022
*/

// creating a class which stores pc info
class PcInfo {

    // creating instance variable
    String pcCompany, processor;
    int ram,ssd;

    // initializing variables
    void inputDetails(String name, String pro, int rams, int ssds){

        // pcCompany = "HP";
        // processor = "i5 12th Gen";
        // ram = 8;
        // ssd = 1;

        pcCompany = name;
        processor = pro;
        ram = rams;
        ssd = ssds;
    }

    // creating a method to print PC's Info
    void printpcInfo() {

        System.out.println("\nCompany Name : "+pcCompany);
        System.out.println("Processor : "+processor);
        System.out.println("RAM : "+ram+"GB");
        System.out.println("SSD : "+ssd+"TB");
    }

}

public class PcDemo { 

    public static void main(String[] args) {
        
        // creating object of PcInfo class
        PcInfo pc1 = new PcInfo();
        PcInfo pc2 = new PcInfo();

        // Creating Instancess of 
        pc1.inputDetails("Dell","i5 12th Gen",8,512);
        pc2.inputDetails("HP","i7 10th Gen",16,1);
        
        // calling method
        pc1.printpcInfo();
        pc2.printpcInfo();
    }
}
