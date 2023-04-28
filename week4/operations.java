import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;
public class operations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1;
        double num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("input a number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("input a different number"));
        double divide = (num1 / num2);
        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, divide);
        double multiply = (num1 * num2);
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, multiply);
        double add = (num1 + num2);
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, add);
        double subtract = (num1 - num2);
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, subtract);
        double power = Math.pow(num1,num2);
        System.out.printf("%.2f^%.2f = %.2f\n", num1, num2, power);
        double sqrt = Math.sqrt(num1);
        System.out.printf("the square root of %.2f is %.2f\n",num1,sqrt);
        double sqrt2 = Math.sqrt(num2);
        System.out.printf("the square root of %.2f is %.2f\n",num2,sqrt2);
        double log = Math.log(num1);
        System.out.printf("log%.0f = %.2f",num1,log);


    }
}
