import java.util.Scanner;

public class PS1_Q5{
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.println("Enter Something");
        boolean result = inp.hasNextInt();

        System.out.print("The result is:\t" + result);

        //The result is:
        //true or false

        //The result is:    true or false
    }
}