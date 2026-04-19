import java.util.Scanner;
public class ScholarshipChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter GPA:");
        double gpa = scanner.nextDouble();
        
        if (gpa < 0.0 || gpa > 4.0 ) {
            System.out.println("Error: Invalid GPA!");
        } else if (gpa >= 3.6){
          System.out.println("Eligible for Scholarship!");
          
        } else if (gpa >= 3.2){
            System.out.println("Eligible for Scholarship!");
        
        } else {
            System.out.println("Not Eligible for Scholarship!");
        }
        
    }
}