abstract class Employee{
    String name;
    int employeeId;
    String department;
     double fixedSalary=5000.0;
    private double baseSalary;

    Employee(String name,int employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
    
    void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }

    abstract void calculateSalary();

    void displayDetails(){ // concrete method for displaying employee details
        System.out.println("Name: "+name+", ID: "+employeeId+", base salary: "+baseSalary);
    }
}


interface Department {
   abstract void assignDepartment(String department);
   abstract void getDepartmentDetails();
}


class FulltimeEmployee extends Employee implements Department{
    int workinghours=8;

    FulltimeEmployee(String name, int employeeId){
        super(name, employeeId);
    }
    @Override
    void calculateSalary(){
        setBaseSalary(fixedSalary*workinghours);
    }
    @Override
    public void assignDepartment(String department){
        this.department=department;
    }
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department of "+name+": "+department);
    }   
}


class ParttimeEmployee extends Employee implements Department{
    int workinghours=4;

    ParttimeEmployee(String name, int employeeId){
        super(name, employeeId);
    }
    @Override
    void calculateSalary(){
        setBaseSalary(fixedSalary*workinghours);
    }
    @Override
    public void assignDepartment(String department){
        this.department=department;
    }
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department of "+name+": "+department);
    }
}


public class EmployeeSystem {
    public static void main(String[] args) {
        Employee employee1=new FulltimeEmployee("Samantha", 101);
        Employee employee2=new FulltimeEmployee("James", 102);

        employee1.calculateSalary();
        employee2.calculateSalary();

        employee1.displayDetails();
        employee2.displayDetails();

        Department departmentOfEmployee1=(Department) employee1;
        Department departmentOfEmployee2=(Department) employee2;

        departmentOfEmployee1.assignDepartment("IT");
        departmentOfEmployee2.assignDepartment("Marketing");

        departmentOfEmployee1.getDepartmentDetails();
        departmentOfEmployee2.getDepartmentDetails();



        
    }
}