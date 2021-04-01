package PS2;

public class Q4 {
    public static void main(String[] args) {
        /*
            -------------------------------------------------------

                    (v^2 - u^2)
                -----------------    =====   v = 1, u = 2 & a = 3 ====>  Gulabo = 0.867 & Simran = -0.1 &                                                           Kamal = -0.1 
                        2a5


        */
        float v = 1;
        float u = 2;
        float a = 3;

        float equation = (v*v - u*u) / (2*a*5);
        /*
            Jitne kam brackets rakh sakte ho utne kam rakho
        */

        System.out.println(equation);
    }
}
