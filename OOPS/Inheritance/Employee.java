public class Employee extends Person{

    String date;
    double salary;
    String insuranceNo;

    public Employee(String name , String date,double salary,String insuranceNo) {

        super(name);
        this.date=date;
        this.insuranceNo=insuranceNo;
        this.salary=salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
    

    
}
