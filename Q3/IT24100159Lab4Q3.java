import java.util.Scanner;
 public class IT24100159Lab4Q3{
 public static void main (String[]args){
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number:");
 int num = scanner.nextInt();
 String output = (num>0) ? "The number is: Positive":
                 (num<0) ? "The number is: Negative":
                 "The number is zero";
System.out.print(output);
   }
}