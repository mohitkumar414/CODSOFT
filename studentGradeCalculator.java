import java.util.*;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of subjects");
        int noOfSubjects = sc.nextInt();
        int marks, totalMarks = 0;
        for (int i = 1; i <= noOfSubjects; i++) {
            System.out.println("Enter marks of subject " + i);
            marks = sc.nextInt();
            totalMarks += marks;
        }
        float totalPercentage = ((float) totalMarks / noOfSubjects);
        String grade;
        if (totalPercentage >= 90.0)
            grade = "A+";
        else if (totalPercentage <= 89.0 && totalPercentage >= 80.0)
            grade = "A";
        else if (totalPercentage <= 79.0 && totalPercentage >= 70.0)
            grade = "B+";
        else if (totalPercentage <= 69.0 && totalPercentage <= 60.0)
            grade = "B";
        else if (totalPercentage <= 59.0 && totalPercentage >= 50.0)
            grade = "C+";
        else if (totalPercentage <= 49.0 && totalPercentage >= 35.0)
            grade = "C";
        else
            grade = "F";
        System.out.println("TOTAL MARKS = " + totalMarks);
        System.out.println("AVERAGE PERCENTAGE = " + String.format("%.2f", totalPercentage));
        System.out.println("GRADE : " + grade);
        sc.close();
    }
}
