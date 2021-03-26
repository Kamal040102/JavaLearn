import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        byte totalScoreOfEachSubject = 100;
        byte totalSubject = 5;

        int totalMarks = totalScoreOfEachSubject * totalSubject;

        System.out.println("Enter the marks of First Subject");
        float marksOfSubject1 = inp.nextFloat();
        System.out.println("Enter the marks of Second Subject");
        float marksOfSubject2 = inp.nextFloat();
        System.out.println("Enter the marks of Third Subject");
        float marksOfSubject3 = inp.nextFloat();
        System.out.println("Enter the marks of Fourth Subject");
        float marksOfSubject4 = inp.nextFloat();
        System.out.println("Enter the marks of Fifth Subject");
        float marksOfSubject5 = inp.nextFloat();

        float totalMarksScored = marksOfSubject1 + marksOfSubject2 + marksOfSubject3 + marksOfSubject4 + marksOfSubject5;
        float percentage = (totalMarksScored/totalMarks)*100;
        System.out.println("Total marks scored by you are:\t" + totalMarksScored);
        System.out.println("Percentage Scored:\t" + percentage);
    }   
}
