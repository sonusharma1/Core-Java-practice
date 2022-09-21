import java.util.Scanner;

/*
Program : WAP to make a class and objects
@author : Sonu Sharma
@Date	: 19 Sep 2022
*/
class Laptop {

    // Properties : Attributes
    String brand;
    float screenSize;
    int model;
    double price;
    String processor;
    String memory;

    // creating method to insert data
    void insertLaptop (String brand, float screenSize, int model, double price, String processor, String memory) {
        this.brand = brand;
        this. screenSize = screenSize;
        this.model = model;
        this.price = price;
    }

    // creating method to print data
    void display() {

        System.out.println("Brand : "+brand);
        System.out.println("Screen Size : "+screenSize);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
        System.out.println("Processor : "+processor);
        System.out.println("Memory : "+memory);
    }
}

public class LaptopShop {
    public static void main(String[] args) {

        // to create object of a class
        Laptop lapObj = new Laptop();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Brand Name");
        lapObj.brand = sc.nextLine();

        System.out.println("Enter Sceen Size");
        lapObj.screenSize = sc.nextFloat();

        System.out.println("Enter Model");
        lapObj.model = sc.nextInt();

        System.out.println("Enter Price");
        lapObj.price = sc.nextDouble();

        System.out.println("Enter Processor");
        lapObj.processor = sc.next();

        System.out.println("Enter Memory");
        lapObj.memory = sc.next();

        // calling inset method
        //lapObj.insertLaptop(lapObj.brand, lapObj.screenSize, lapObj.model, lapObj.price, lapObj.processor, lapObj.memory);

        // calling display method
        System.out.println("\n\nLaptop Details are :");
        lapObj.display(); 
    }
}
