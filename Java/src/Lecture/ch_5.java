package Lecture;

import java.util.Scanner;

public class ch_5 {
    public static void main(String[] args) {
        // Print 1 to 100

        /*
         * While Loop
         * 
         * int x = 101; // Initilization while(x <= 100){ // Jab tak & Condition
         * System.out.println(x); x++; // Incrementaion }
         */

        /*
         * do While Loop
         * 
         * int x = 1; do{ // Ye karo System.out.println(x); x++; } while(x <= 100); //
         * jab tak
         */

        /*
         * for loop
         * 
         * //for(intialise; condition; increment/decrement)
         * 
         * for(int n = 1; n <= 100; n++){ System.out.println(n); }
         */

        /*
         * QQ.1
         * 
         * int x = 100; while(x <= 200){ System.out.println(x); x++; }
         */

        /*
         * QQ.2
         * 
         * Scanner inp = new Scanner(System.in); try {
         * System.out.println("Enter a number"); int n = inp.nextInt();
         * 
         * int initial = 1;
         * 
         * do { System.out.println(initial); initial++; } while (initial <= n); }
         * finally { inp.close(); }
         */
        /*
         * QQ.3
         */
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter a numebr");
            int x = inp.nextInt();

            for (int i = x; i >= 0; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } finally {
            inp.close();
        }
    }
}