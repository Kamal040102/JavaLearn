import java.lang.ref.Cleaner;

public class Lecture_4{
    public static void main(String[] args) {
        // System.out.println("7" + "8");
        // System.out.println(7 + 8);

        // byte var = 18;

        // if(var == 18.1){
        //     System.out.println("Movika");
        // }

        //---------------------------------------
        //        Arithmatic Operator
        //---------------------------------------
        
        // +, -, / ,* ,%, ++, --

        // int a = 789;   // int / int = int
        // int b = 650;

        // System.out.println(a + b); // Sum operator
        // System.out.println(a - b); // Subtract operator
        // System.out.println(a / b); // Divide Operator
        // System.out.println(a * b); // Multiplication operator
        // System.out.println(a % b); // Remainder Operator
        
        //++ => Increment by 1   => 789++ = 79

        // Increment operator
        //-------------------------------------------------------------------
        // int a = 789; //new vsalue a = 790
        // // System.out.println(a++); // 789++ ===> a = 789++ => 790 
        // // System.out.println(a); // 

        // System.out.println(++a); //1+789 = 790   ====>a = 790
        // System.out.println(a);
        //------------------------------------------------------------------------

        // Decrement operator
        //------------------------------------------------------------------------

        // int a = 456; // new value = 455
        // System.out.println(a); //456
        // System.out.println(a--); //456
        // System.out.println(--a); //454
        //---------------------------------------------------------------------------

        // int a = 9-8 + 7; // 7    && -47
        // int b = (9-8) * 7; // 7     && 7

        // System.out.println(a);
        // System.out.println(b);

        // int a = 7 * 8 - 6 / 2 * 7;
        /*
            56 - 6 / 2 * 7
            56 - 3 * 7
            56 - 21
            35
        */

        // byte b = 19;
        // b = b++; // R to L ====> b++ = 20 ====> b


        /*
            x - y
           ---------    =====>    0.5  or 1/2
               2
        */
            // float equation = (2f - 1f) / 2f;
            // System.out.println(equation);



        //  b^2 - 4ac
        // -------------    ======>   a=1, b=2, c=3 ===> -4
        //     2a

        int a = 1;
        int b = 2;
        int c = 3;

        int equation = (b * b - 4* a* c) / (2 *a); 
        System.out.println(equation);

    }
}