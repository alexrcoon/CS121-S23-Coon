import java.util.Scanner;
import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {

        String userName = "username";
        String password = "password";
        String user;
        String pw;

        user = JOptionPane.showInputDialog("Please enter a username:");
        pw = JOptionPane.showInputDialog("Please enter a password:");
        if (userName.equals(user) && password.equals(pw)) {
            System.out.println("Welcome to CS121");
        } else if (!userName.equals(user) && pw.equals(password)) {
            System.out.println("You have entered an incorrect username.");
        } else if (user.equals(userName))
                    System.out.println("You have entered an incorrect password.");
        else {
            System.out.println("Both username and password are incorrect.");
        }

        }


    }

