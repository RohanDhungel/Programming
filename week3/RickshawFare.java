import java.util.Scanner;
public class RickshawFare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = input.nextDouble();

        System.out.print("Enter time (minutes): ");
        double time = input.nextDouble();

        System.out.print("Is the customer local? (true/false): ");
        boolean isLocal = input.nextBoolean();

        System.out.print("Is it night travel? (true/false): ");
        boolean isNight = input.nextBoolean();

        double fare = (distance * 50) + (time * 2);

        
        fare = isLocal ? fare : fare + 50;
        fare = isNight ? fare + 100 : fare;
      
        System.out.println("Final Fare: Rs. " + fare);

        input.close();
    }
}