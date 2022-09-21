/*
Program : WAP to make cart of any product
@author : Sonu Sharma
@Date	: 19 Sep 2022
*/
import java.util.Scanner;
class Books {

    private String bookName, authorName;
    private int yearofPublication;
    private double bookPrice;
    static double CartTotalAmt = 0;

    void insertBook(String bookName, String authorName, int yearofPublication, double bookPrice) {

        this.bookName = bookName;
        this.authorName = authorName;
        this.yearofPublication = yearofPublication;
        this.bookPrice = bookPrice;
    }

    void dispalyBook() {

        System.out.println("\nBook Name : "+bookName);
        System.out.println("Author Name : "+authorName);
        System.out.println("Year of publication : "+yearofPublication);
        System.out.println("Price : "+bookPrice);
    }

    // method for calculate the cart's total amountt
    static void calAmount(double price) {
        CartTotalAmt += price;
    }
}

public class BookCart {
    public static void main(String[] args) {
        
        // creating array of class
        Books bookArray[] = new Books[10]; 

        Scanner sc = new Scanner(System.in);        
        int choice = 1;
        int bookIndex = 0;

        while(choice == 1) {

            System.out.println("Do you want to buy a book (1) yes / (0) no");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Enter Book Name");
                String bookName = sc.next();
                System.out.println("Enter Author Name");
                String authorName = sc.next();
                System.out.println("Enter Year of publication");
                int yearofPublication = sc.nextInt();
                System.out.println("Enter Book Price");
                Double bookPrice = sc.nextDouble();

                bookArray[bookIndex] = new Books();
                bookArray[bookIndex].insertBook(bookName, authorName, yearofPublication, bookPrice);  
                bookIndex++;              
            }
        }

        bookArray[0].dispalyBook();
    }
}
