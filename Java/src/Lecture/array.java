package Lecture;

public class array {
    public static void main(String[] args) {
        // Stroing the marks of 5 students
        /*
         * int student1 = 50; int student2 = 98; int student3 = 88;
         * 
         * System.out.println(student1); System.out.println(student2);
         * System.out.println(student3);
         */

        // Java Initilisation of arway is in 3 types

        /*
         * Way.I of Intitialising array (Static)
         * 
         * int [] arr = new int [6]; //0,1,2,3,4,5 arr [0] = 89; arr[1] = 56; arr[2] =
         * 23; arr[3] = 45; arr[4] = 12; arr[5] = 33; arr[6] = 52;
         * 
         * System.out.println(arr[3] + " " + arr[4] + " " + arr[0] + " " + arr[6]);
         */

        /*
         * way 2 of initilising array (Static)
         * 
         * int [] arr; // Initialisation part arr = new int [6]; // declaration poarrt
         * arr[0] = 85; arr[1] = 56; arr[1] = 56; arr[2] = 23; arr[3] = 45; arr[4] = 12;
         * arr[5] = 33;
         * 
         * System.out.println(arr[5]);
         */

        /*
         * way 3 of intialising array int arr [] =
         * {12,747,1,2,4,64,67,64,361,4,4,641,63,46,76,413,13,46,13,164,64};
         * System.out.println(arr[10]);
         */

        // Methods in JAVA
        int arr[] = { 12, 747, 1, 2, 4, 64, 67, 64, 361, 4, 4, 641, 63, 46, 76, 413, 13, 46, 13, 164, 64 };
        /*
         * Length System.out.println(arr.length);
         */
        /*
         * Displaying all values of Array
         * 
         * no. of for loop applied will depend on dimension of the array.
         * 
         * arr[] = {1,2,3,4,5}; // One-diemsional array
         * 
         * Two diemsional array: int arr[][] = new int [2][2]; arr [0][0] = 12; arr
         * [0][1] = 13;..................
         */

        /*
         * Printing of 1D array
         * 
         * for(int i = 0; i <= arr.length - 1; i++){ System.out.print(arr[i] + " "); }
         */

        // arr[i][j];
        /*
         * printing of 2 dimensional array
         * 
         * int arr2 [][] = new int [2][2]; arr2 [0][0] = 12; arr2 [0][1] = 45; arr2
         * [1][0] = 78; arr2 [1][1] = 98;
         * 
         * for(int i = 0; i <= arr2.length - 1; i++){ for(int j = 0; j <= arr2.length -
         * 1; j++){ System.out.print(arr2[i][j] + " "); } System.out.println(""); }
         */

        /*
         * // Printing of 1D array in reverse order
         * 
         * for(int i = arr.length - 1; i >= 0; i--){ System.out.print(arr[i] + " "); }
         */

        /*
         * // For-Each loop for(int x : arr){ System.out.print(x + " "); }
         */
    }
}