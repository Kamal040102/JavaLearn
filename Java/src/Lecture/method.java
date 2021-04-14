package Lecture;

public class method{
    static void changeArr (int [] arr){
        arr[1] = 78;
    }
    public static void main(String[] args) {
        int arr[] = {12,45,78,98,65};
        changeArr(arr);
        System.out.println(arr[1]);

        for(int i = 0; i <= arr.length - 1; i++){
            System.out.println(arr[i]);
        }
    }
}