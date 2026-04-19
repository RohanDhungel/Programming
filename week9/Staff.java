class Staff extends Person{
    double workingHours;
    double ratePerHour;
    

    Staff(int id, String name, double basicSalary, double workingHours, double ratePerHour){
    super(id, name, basicSalary);
    this.workingHours= workingHours;
    this.ratePerHour = ratePerHour;
}
double calculateSalary(){
    return workingHours + ratePerHour;
}
}