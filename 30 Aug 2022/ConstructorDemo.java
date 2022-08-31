/*
Program: Oops Concept -> Constructor
@author: Sonu Sharma
@Date: 30 Aug 2022
*/
// creating a class which stores pc info
class PcInfo {

    // creating instance variable
    String pcCompany, processor;
    int ram,ssd;
    boolean hasGTX;

    // PcInfo() -> default constructor
    // no args constructor -> if we create own constructor then default will be overwritten
    PcInfo() {
        System.out.println("No Arguments Constructor");
        pcCompany = "Dell";
        processor = "i3 12th Gen";
        ram = 8;
        ssd = 512;
        hasGTX = true;
    }
    
    // parameterized constructor
    PcInfo (String name, String pro, int rams, int ssds){
        System.out.println("With Arguments Constructor");
        this.pcCompany = name;
        this.processor = pro;
        this.ram = rams;
        this.ssd = ssds;
    }

    // CONSTRUCTOR overloading
    PcInfo (String name, int rams, int ssds){
        System.out.println("CONSTRUCTOR overloading");
        this.pcCompany = name;
        this.processor = "i5 12th Gen";
        this.ram = rams;
        this.ssd = ssds;
    }

    // creating a method to print PC's Info
    void printpcInfo() {

        System.out.println("\nCompany Name : "+pcCompany);
        System.out.println("Processor : "+processor);
        System.out.println("RAM : "+ram+"GB");
        System.out.println("SSD : "+ssd+"TB");
    }

}

public class ConstructorDemo {

    //creating constructor
    ConstructorDemo(){
        System.out.println("Automatic called");
    }

    public static void main(String[] args) {
        
        PcInfo obj = new PcInfo();
        PcInfo obj1 = new PcInfo("HP","i7 10th Gen",16,1);
        PcInfo obj2 = new PcInfo("HP",16,1);

        obj.printpcInfo();
        obj1.printpcInfo();
        obj2.printpcInfo();
    }
}
