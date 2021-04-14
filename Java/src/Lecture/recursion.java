package Lecture;

public class recursion {
    static int factorial(int x){
        // 5 => 5*4*3*2*1*0 ==> 0! = 1;
        if(x == 0 || x == 1){
            return 1;
        }
        else{
            return x * factorial(x - 1);
        }
    }

    static int sum(int x){
        // 5 => 5*4*3*2*1*0 ==> 0! = 1;
        if(x == 1){
            return 1;
        }
        else if(x == 0){
            return 0;
        }
        else{
            return x + sum(x - 1);
        }
    }


    /*
        factorial (5): 5 * 4 * 3 * 2 * 1;
    */
    public static void main(String[] args) {
        // Recursion : 1 + 2 + 3 + 4 + 5+.......
        /*
            Iteration Mehtod: (Using Loops)
            int a = 0;
            for(int i)
            Background : None (Spcae complexity is less)

            Recursion Method: (Callin gth esame function iside the function)
            Backgroound : Stack (Space Complexity High)
        */
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(0));

        System.out.println("Sum:"+sum(10));
        System.out.println("Sum:"+sum(0));

        // Fibonacci Series: 0 1 1 2 3 5 8 13 21 .......
    }
}
