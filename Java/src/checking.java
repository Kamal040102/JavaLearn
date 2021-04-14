import java.util.Scanner;

public class checking {
    public static void main(String[] args) {

        int arr[] = { 78, 56, 20, 90, 12 };
        int min = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("The arr Minimum value is = " + min);
    }
}