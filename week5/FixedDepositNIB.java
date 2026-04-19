import java.util.Scanner;
 public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice ="yes";
        
    while(choice.equalsIgnoreCase("yes")) {
        System.out.print("Enter amount: ");
        double P = scanner.nextDouble();
        
        if(P<1000){
            System.out.println("minimun deposit is 1000");
            continue;
        }
        
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        if(Rate <8 || Rate >12){
            System.out.println("rate must be 8 to 12");
            continue;
        
        System.out.print("Enter Years: ");
        int Years = scanner.nextInt();
        
        if (Years >5){
            System.out.println("5 Years max");
            continue;
        }
        double A = P* Math.pow(1 + rate / 100 / 12, Years* 12);
        double fee = A*0.005;
        
        System.out.println("Final Amount: Rs." +(int)(A-fee));
        
        System.out.print("Continue? (yes/no):");
        choice = scanner.next();        
    }
    }
}