import java.util.Scanner;

class StudentDetails {

    private String name, password;
    private int id;

    void addStudents () {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter Name");
        this.name = sc.nextLine();
        System.out.println("Enter id");
        this.id = sc.nextInt();
        
        this.password = this.name+"123";
        
    }

    void displayStudent() {

        System.out.println("\nName : "+this.name);
        System.out.println("ID : "+this.id);
        System.out.println("Password : "+password);
    }
}

public class Students {

    public static void main(String[] args) {

        // creating array of an object
        StudentDetails stuObj [] = new StudentDetails [5]; // this is only reference

        for (int i = 0; i < stuObj.length; i++) {

            System.out.println("Creating Student "+(i+1));
            stuObj [i] = new StudentDetails(); // allocation of memory to each students
            stuObj[i].addStudents();
        }

        // calling method to print student details
        for (int i = 0; i < stuObj.length; i++) {
            stuObj[i].displayStudent();
        }

        // stuObj.addStudents();
        // stuObj.displayStudent();
    }
}
