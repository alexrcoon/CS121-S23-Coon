import java.util.Scanner;
import javax.swing.JOptionPane;
public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int s1;
        int s2;
        int s3;

        s1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter side 1:"));
        s2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter side 2:"));
        s3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter side 3:"));
        if (s1 == s2 && s2 == s3) {
            System.out.print("The triangle is equilateral.");
        } else if (s1 != s2 && s2 != s3) {
            System.out.print("The triangle is scalene.");
        } else {
            System.out.print("The triangle is Isosceles.");
        }
    }
}
