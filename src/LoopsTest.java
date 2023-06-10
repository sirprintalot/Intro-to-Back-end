import javax.swing.*;
import java.lang.*;



public class LoopsTest {
    public static void main(String[] args) {
        StringBuilder table = new StringBuilder();

        for(int cont = 1; cont <= 20; cont++){
            table.append("Multiplication table of ").append(cont).append(":  ");
            for (int multi = 1; multi <= 10; multi++){
//                System.out.print(" "+"*"+" ");
                table.append(cont * multi).append(" ");
            }
            table.append("\n");
        }
        JOptionPane.showMessageDialog(null, table.toString(), "Multiplication Table", JOptionPane.INFORMATION_MESSAGE);
    }
    }
