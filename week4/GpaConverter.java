import java.util.Scanner;
public class GpaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter GPA :");
        double gpa = scanner.nextDouble();
        
        if(gpa< 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA!");
        } else if (gpa >= 3.2) {
            System.out.println("Grade: A");
        } else if (gpa >= 2.4) {
            System.out.println("Grade: B");
        } else if (gpa >= 1.6) {
            System.out.println("Grade: C");
        } else if (gpa >= 1.2) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F"); 
        }
        
    }
    
}