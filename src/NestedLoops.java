public class NestedLoops {
    public static void main(String[] args) {
//        for creating a multiplying table first we create a for loop incrementing by 1, and we nest another for loop
//        inside the first increasing by 1 too. then we multiply the first loop and the second loop
        for (int counter = 1; counter <= 10; counter++){
            System.out.println("|**************************************************|");

            for (int multi = 1; multi <= 10; multi++) {
                System.out.print(counter * multi + " - ");
            }
            System.out.println();
        }

    }
}
