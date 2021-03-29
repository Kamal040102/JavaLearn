import java.util.Scanner;

public class Movika {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        byte totalScore= inp.nextByte();
        System.out.println("your total score" + totalScore);
   
        Byte totalSubject = 5;
        int totalMarks =totalSubject*totalScore;
   
        float A = inp.nextFloat();
        System.out.println("your subject maths marks are" + A);
        float B = inp.nextFloat();
        System.out.println("your subject OOPS marks are" + B);
        float C = inp.nextFloat();
        System.out.println("your subject DM marks are" + C);
        float D = inp.nextFloat();
        System.out.println("your subject BME marks are" + D);
        float E = inp.nextFloat();
        System.out.println("your subject DBMS marks are" +E);
        
   
        float sum= A+ B+C+D+E;
        float percentage = (sum/totalMarks)*100;
   
        System.out.println("you total score " + sum  );
        System.out.println("your parcentage is "+ percentage);
   
    }
}
