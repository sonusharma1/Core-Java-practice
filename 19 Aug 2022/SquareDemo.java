class SquareDemo{

    static void checkSquare(int s_len, int s_bre){
        
        if (s_len == s_bre) {
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is not a square");
        }
    }

    public static void main(String[] args) {
        
        int side_length = Integer.parseInt(args[0]);
        int side_breadth = Integer.parseInt(args[1]);

        checkSquare(side_length, side_breadth);
    }
}