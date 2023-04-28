import java.util.Scanner;
import javax.swing.JOptionPane;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number:"));
        if (n % 2 == 0) {
            System.out.println("The number is even.");
        } else System.out.println("The number is odd.");

    }
}
