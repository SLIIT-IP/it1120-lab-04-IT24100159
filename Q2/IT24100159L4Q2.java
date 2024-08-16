import java.util.Scanner;
public class IT24100159L4Q2{
public static void main(String[]args){
 Scanner scanner = new Scanner(System.in);
 double examMarks;
 double labSubmissionMarks;
 int exPercentage;
 int labPercentage;
 double fiExamMarks;
 double fiLabMarks;
 double finalExamMark;
 System.out.print("Please enter exam marks (out of 100):");
 examMarks = scanner.nextDouble();
 if (examMarks<0 || examMarks>100){
 System.out.print("Invalid input for exam marks.Terminating program.");
} System.exit(0);
 System.out.print("Please enter lab submission marks (out of 100):");
 labSubmissionMarks = scanner.nextDouble();
 System.out.print("Please enter the percentage given for the exam:");
 exPercentage = scanner.nextInt();
 System.out.print("please enter the percentage given for the lab submission:");
 labPercentage = scanner.nextInt();
  
 if( exPercentage+labPercentage != 100){
 System.out.print("The percentage must add up to 100.Terminating program.");
} System.exit(0);
  fiExamMarks = (examMarks*exPercentage/100);
  fiLabMarks = (labSubmissionMarks*labPercentage/100);

  finalExamMark = (fiExamMarks+fiLabMarks);
 System.out.print("Final Exam Mark is : "+ finalExamMark);
  }
}
 