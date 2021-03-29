import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class Lecture_5{
    public static void main(String[] args) {
    //     char a = 'a'; //UTF-8 ====> a = 97   ===> 97   +    18  
    //     int b = 18;
    //    char result = (char) (a + b);   //type-casting

    //     System.out.println((char) (a + b + 10));  // } ===> 125
    //     System.out.println(result);

        // char a = 'a';  // 97
        // int b = 2147483647; // 32767 + 97 ==> 32864 ===> Short range greter ==> Integer

        // //char + short = integer
        // //char + int ===> integer 
        
        // //but, garbage value (int range > answer)
        
        // System.out.println(a + b);

        // byte a = 127; /// Original
        // a = ++a; // a = a++;  a = 17++ // Memory : 18
        // //byte b = ++a; // b = 18;

    //     byte a = 127;
    //    short b = (short) ++a;
    //     System.out.println(a);
    //     System.out.println(b);  //+128 X   garbage Value ===> byte 127 ===> 

    int a = 127;
    System.out.println(a);
    a = a++; // 128   Print = 127   Store = 128
    System.out.println(a);
    int b = ++a; //Print = 128 Store = 128

    /*
        a = 127
        a = a++ ====> 127 ===> 128

    */

    System.out.println(a + " " + b);
    }
}