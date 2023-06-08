public class Variable {
    public static void main(String[] args) {
//first you have to declare the type of variable.

//these are the primitive data types:
//**byte size 1 byte Stores whole numbers from -128 to 127
//**short 2 bytes Stores whole numbers from -32,768 to 32,767
//**int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//**long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


//        This is a byte.
        byte smallNumber = 2;
//        this is a short.
        short mediumNumber = 32767;
//        this is an integer.
        int age = 4;
//        this is a long integer.You have to use 'L' at the end of the number to specify that is a long number.
        long numLong = 1234566987418947235L;


//        this is a decimal number.
        double pay = 5.5;
//        float	size 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits. Specify at the end that is a float number using de 'f'.
        float myFloatNum = 5.99f;


//        Boolean type
        boolean a = true;
        boolean b = false;


//Char is user for store one character.
//char size 2 bytes	Stores a single character/letter or ASCII values
        char capitalC = 'C';

//        for long text you may use th string type
//        The String class is not technically a primitive data type, but considering the special support given to it by the language, you'll probably tend to think of it as such.
        String myName = "Mauricio Cardona";


//        you can 'force' a variable to change its type with the CAST method.
        double num1 = 44.66;
        int numInteger = (int) num1;


    }
}
