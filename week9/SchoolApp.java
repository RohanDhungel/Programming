public class SchoolApp{
    public static void main(String[] args){
        Teacher t = new Teacher(1, "Ram",30000, "Math", 5000);
        Staff s= new Staff(2,"Sita",20000,160,50);
        
        System.out.println("Teacher Salary:"+t.calculateAnnualSalary());
        System.out.println("Staff Salary:"+s.calculateSalary());
        System.out.println("College:" + Person.collegeName);
    }
}