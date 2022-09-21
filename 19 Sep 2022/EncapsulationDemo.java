import java.util.Scanner;

/*
Program : Encapsulation Example
@author : Sonu Sharma
@Date	: 20 Sep 2022
*/

class Student {

    private int id;
    private String name, password;

    void setData(int id, String name) {
        this.id = id;
        this.name = name;
        this.password = name+id;
    }

    void getData() {
        System.out.println("\nName : "+id);
        System.out.println("ID : "+name);
        System.out.println("Password : "+password);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // creating array of an object
        Student stuArray [] = new Student[2];

        for (int i = 0; i < stuArray.length; i++) {
          
            System.out.println("Enter id");
            int id = sc.nextInt();
            System.out.println("Enter Name");
            String name = sc.next();  

            // this is reference 
            stuArray[i] = new Student();
            // this is actual data
            stuArray[i].setData(id, name);
        }
        
        // this will print reference value of stuArray[0]
        System.out.println("\n\n"+stuArray[0]);
        // this will print actual data of stuArray[0]
        stuArray[0].getData();
    }
}
