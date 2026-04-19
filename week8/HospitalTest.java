class Patient {
    String name;
    int age;
    int days;
    double charge;
    
    Patient(String name, int age, int days, double charge){
        this.name =name;
        this.age = age;
        this.days = days;
        this.charge = charge;
    }
    
    double calculatetotalbill() {
        double total = days* charge;
        if(days > 7) {
            total = total - (total* 0.10);
        }
        return total;
        
        }
    }
public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ram", 25, 5 ,1000);
        Patient p2 = new Patient("sita", 40 ,10 ,1500);
        
        System.out.println(p1.name + "Bill :Rs. " + p1.calculatetotalbill());
        System.out.println(p2.name + "Bill :Rs. " + p2.calculatetotalbill());
    }
}
    
    
    