import java.util.Scanner;

/*
@author : Sonu Sharma
@Date	: 21 Sep 2022
*/

public class MyCart {

    Scanner sc = new Scanner(System.in);

    ItemList notebook[];
    ItemList pen[];
    ItemList cartItem[] = new ItemList[3];

    // private MyCart[] cartItem = new MyCart[3];
    int cartIndex = 0;
    private double totalBillAmt = 0;
    private String purchaseProduct;

    MyCart() {

        notebook = new ItemList[3];
        notebook[0] = new ItemList("Classmate", 4, 28.0);
        notebook[1] = new ItemList("Natraj", 2, 25.0);
        notebook[2] = new ItemList("Satyam", 2, 18.0);

        pen = new ItemList[2];
        pen[0] = new ItemList("Cello", 3, 8.0);
        pen[1] = new ItemList("Lexi", 2, 5.0);

        displayItems();
    }

    public double getTotalBillAmt() {
        return this.totalBillAmt;
    }

    public void setPurchaseProduct() {
        this.purchaseProduct = sc.next().toLowerCase();
    }
    public String getPurchaseProduct() {
        return this.purchaseProduct;
    }

    void displayItems() {

        while (cartIndex != 3) {
            System.out.println("\nwhich type of item, you want to buy?\nEnter notebook or pen\n");
            int choice = 0;
            setPurchaseProduct();
            System.out.println();

            switch (this.purchaseProduct) {
                case "notebook":
                    for (int i = 0; i < notebook.length; i++) {
                        System.out.println(i + ".  " + notebook[i].getName() + "      " + notebook[i].getQuantity()+ "       " + notebook[i].getPrice() + "rs");
                    }
                    System.out.println("Enter index no. \n");
                    choice = sc.nextInt();
                    addNotebookToCart(choice);
                    break;

                case "pen":
                    for (int i = 0; i < pen.length; i++) {
                        System.out.println(i + ".  " + pen[i].getName() + "      " + pen[i].getQuantity() + "       "+ pen[i].getPrice() + "rs");
                    }
                    System.out.println("Enter index no. \n");
                    choice = sc.nextInt();
                    addPenToCart(choice);
                    break;

                default:
                    break;
            }
        }
        displayCartItems();
    }

    void addNotebookToCart(int choice) {

        cartItem[cartIndex] = new ItemList();
        cartItem[cartIndex] = notebook[choice];
        this.totalBillAmt += notebook[choice].getPrice();
        cartIndex++;
    }

    void addPenToCart(int choice) {

        cartItem[cartIndex] = new ItemList();
        cartItem[cartIndex] = pen[choice];
        this.totalBillAmt += pen[choice].getPrice();
        cartIndex++;
    }

    void displayCartItems() {
        System.out.println("\n-------------------------------------");
        System.out.println("            your cart       ");
        System.out.println("-------------------------------------\n");
        for (int i = 0; i < cartItem.length; i++) {
            System.out.println(cartItem[i].getName() + "      " + cartItem[i].getPrice());
        }
    }
}
