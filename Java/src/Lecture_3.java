import java.util.Scanner;

public class Lecture_3{
    public static void main(String[] args) {
        //Char ('')
        // char a = 6465;
        // System.out.println(a);

        // //Boolean    "Always returns true or false"
        // byte b = 64;

        // boolean result = b <= 64;
        // System.out.println(result);


        // byte char = 64;
        // System.out.println(char);




        /* 
            1111 ====>   4 bit
            1111.1111111111111111111111111111 ===> 32 bit
            1111.111111111111111111111111111111111111111111111111111111111111 ===> 64 bit
        */


        char chr = 'A';
        System.out.println(chr);

        //Boolean  ==== true or false

        byte movika = 60;
        boolean result = movika > 100;
        System.out.println(result);


        //taking input form the user
        Scanner inp = new Scanner (System.in);

        // Integer Input
        // int gulabo = inp.nextInt();
        // System.out.println("Your input is " + gulabo);

        // String Input
        // String str = inp.nextLine();
        // System.out.println("Your input is " + str);

        //Float Input
        float simran = inp.nextFloat();
        System.out.println("your C is " + simran);


        //char name= inp.next();
        //Long, Double.
    }
}