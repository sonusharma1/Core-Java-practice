/*
Program: Oops Concept -> Constructor
@author: Sonu Sharma
@Date: 30 Aug 2022
*/

class StudentInfo {
    
    String stuName;
    int rollNo;
    String status;

    StudentInfo(String name, int rNo, String stus) {

        this.stuName = name;
        this.rollNo = rNo;
        this.status = stus;
    }

    void printStudentInfo(){

        if (status == "approved") {
            System.out.println("\nStudent name : "+stuName);
            System.out.println("Roll no : "+rollNo);
            System.out.println("You are approved\n");
        }
    }
}

public class StudentsConst {
    
    public static void main(String[] args) {
        
        StudentInfo stuObj1 = new StudentInfo("Sharma", 2, "approved");
        StudentInfo stuObj2 = new StudentInfo("Sonu", 3, "Not approved");
        StudentInfo stuObj3 = new StudentInfo("Palis", 4, "Not approved");
        StudentInfo stuObj4 = new StudentInfo("Ratnesh DJ", 5, "approved");

        stuObj1.printStudentInfo();
        stuObj2.printStudentInfo();
        stuObj3.printStudentInfo();
        stuObj4.printStudentInfo();
    }
}
