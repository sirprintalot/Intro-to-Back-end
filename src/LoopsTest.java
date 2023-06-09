public class LoopsTest {
    public static void main(String[] args) {

        for(int col = 9; col > 0; col--){
            System.out.print("column number  " + col + " ---- ");
            for (int row = col; row > 0; row--){
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
    }
    }
