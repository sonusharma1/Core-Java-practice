import java.util.Scanner;

/*
@author : Sonu Sharma
@Date	: 21 Sep 2022
*/

public class MyCart {

    Scanner sc = new Scanner(System.in);

    ItemList item[];
    ItemList cartItem[] = new ItemList[3];

    int cartIndex = 0;
    private double totalBillAmt = 0;
    int nullCart = 0;

    MyCart() {

        item = new ItemList[7];
        item[0] = new ItemList("Chips", 4, 28.0);
        item[1] = new ItemList("Notebook", 2, 25.0);
        item[2] = new ItemList("Milk ", 2, 18.0);
        item[3] = new ItemList("Cello", 3, 8.0);
        item[4] = new ItemList("Lexi", 2, 5.0);
        item[5] = new ItemList("Butter", 2, 45.0);
        item[6] = new ItemList("Icecream", 2, 15.0);
        // item[7] = new ItemList();

        for (int i = 0; i < item.length; i++) {
            System.out.println(i + ".  " + item[i].getName() + "      " + item[i].getQuantity() + "       "+ item[i].getPrice() + "rs");
        }

        addItemToCart();
    }

    public double getTotalBillAmt() {
        return this.totalBillAmt;
    }

    void addItemToCart() {

        while (cartIndex != 3) {

            System.out.println("\nEnter Product Number, you want to buy");
            int itemNo = sc.nextInt();
            System.out.println("" + item[itemNo].getName()+ " added to your cart successfully :)\n------------------------------------------------");

            cartItem[cartIndex] = new ItemList();
            cartItem[cartIndex] = item[itemNo];
            this.totalBillAmt += item[itemNo].getPrice();
            cartIndex++;
        }
        displayCartItems();
        removeCartItem();

    }

    void removeCartItem() {

        int noOfItemsRemoved = 0;

        System.out.println("\nAre you want to remove any item? y/n )");
        char choice = sc.next().charAt(0);
        while (choice == 'y') {

            System.out.println("\nEnter Product Number, you want to Remove");
            int itemNo = sc.nextInt();
            totalBillAmt -= cartItem[itemNo].getPrice();
            cartItem[itemNo] = null;
            noOfItemsRemoved++;
            System.out.println("" + item[itemNo].getName()+ " removed from your cart :(\n------------------------------------------------");

            System.out.println("\nAre you want to remove any item? y/n ");
            choice = sc.next().charAt(0);
        }
        displayCartItems();

        if(noOfItemsRemoved > 0)
            updateCartItem(noOfItemsRemoved);
    }

    void updateCartItem(int leftSpaceInCart) {
        System.out.println("\nYou can add " + leftSpaceInCart + " item in cart");
        System.out.println("are you want to update your cart y/n");
        char choice = sc.next().charAt(0);

        if (choice == 'y') {

            for (int i = 0; i < item.length; i++) {
                System.out.println(i + ".  " + item[i].getName() + "      " + item[i].getQuantity() + "       "
                        + item[i].getPrice() + "rs");
            }

            while (choice == 'y' && leftSpaceInCart > 0) {

                System.out.println("\nEnter Product Number, you want to buy");
                int itemNo = sc.nextInt();

                for (int i = 0; i < cartItem.length; i++) {
                    if (cartItem[i] == null) {
                        
                        cartItem[i] = item[itemNo];
                        System.out.println("" + item[itemNo].getName()+ " added to your cart successfully :)\n------------------------------------------------");
                        this.totalBillAmt += item[itemNo].getPrice();
                        leftSpaceInCart--;
                    }
                }
                if(leftSpaceInCart > 0) {
                    System.out.println("\nare you want to update your cart y/n");
                    choice = sc.next().charAt(0);
                }
            }
        }
        displayCartItems();
    }

    void displayCartItems() {
        System.out.println("\n-------------------------------------");
        System.out.println("            your cart       ");
        System.out.println("-------------------------------------\n");
        for (int i = 0; i < cartItem.length; i++) {
            if (cartItem[i] != null) {
                System.out.println(i + "    " + cartItem[i].getName() + "      " + cartItem[i].getPrice());
            }
        }
        System.out.println("-------------------------------------");
    }
}
