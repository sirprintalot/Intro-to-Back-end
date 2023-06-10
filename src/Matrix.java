public class Matrix {
    public static void main(String[] args) {
        char character = '*';
        for (int row = 0; row <= 10; row++){
            for (int col = 0; col <= 10; col++){
                if (col > row){
//                    System.out.print(" @ ");q
                    break;
                }
                System.out.print(" * ");
            }
        System.out.println();
        }

    }
}
