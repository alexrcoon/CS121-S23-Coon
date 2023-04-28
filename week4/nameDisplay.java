import java.util.Scanner;
import javax.swing.JOptionPane;

public class nameDisplay {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String firstName;
        String lastName;
        firstName = JOptionPane.showInputDialog("what is your first name?");
        lastName = JOptionPane.showInputDialog("what is your last name?");




        String fullName = String.format("%s %s\n", firstName, lastName);
        System.out.printf(fullName);

        System.out.printf(fullName.toUpperCase());
        System.out.printf(fullName.toLowerCase());

        String nstr="";
        char ch;

        for (int i=0; i< fullName.length(); i++)
        {
            ch= fullName.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println(nstr);
        console.close();
    }
}
