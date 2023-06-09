public class Conditionals {
    public static void main(String[] args) {
//        the shortcut for printing a line is sout+tab

        System.out.println("Testing conditionals. \n");
        int age = 12;
        int companions = 4;
        String greet = "Welcome!!";
        String dismiss = "Sorry we can't let you in.";
        if (age >= 18 || companions<2) {
            System.out.println("You are " + age + " years old " + greet);
        }
        else if (age < 18){
            System.out.printf("You are " + age +" years old, but you have "+ companions+ " companions so you can come in! " + greet);
        }
        else {
            System.out.println("You are " + age + " years old " + dismiss );
        }
    }

}
