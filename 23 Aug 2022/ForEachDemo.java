
public class ForEachDemo {

    static void printColor(){

        String colorArray [] = {"Red", "Blue", "Green", "Orange"};

        for (String colors_name : colorArray) {
            System.out.println(colors_name);
        }
    }

    static void printNames(String[] names){

    }
    
    public static void main(String[] args) {
        printColor();
        printNames(new String[] {"sonu", "sharma"}); //Anonymous Array
    }
}
