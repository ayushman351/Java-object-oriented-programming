package access_modifiers;

class Employee {
    public int empId;
    protected String department;
    private double salary;

    Employee(int empId){
        this.empId=empId;
    }

    void setSalary(double salary){
        this.salary=salary;
        System.out.println("Salary added!");
    }
    double getSalary(){
        return salary;
    }

}

class Manager extends Employee{
    Employee employee;
    Manager(int empId, Employee employee){
        super(empId);
        this.employee=employee;
    }

}
public class EmployeeRecords {
    public static void main(String[] args) {
        Employee employee1=new Employee(351);
        employee1.department="Backend-development";
        employee1.setSalary(30000);
        System.out.println("Your salary is: "+employee1.getSalary());

        Manager manager=new Manager(111,employee1);
        manager.department="Backend-Development";

        System.out.println("This employee's id is: "+manager.employee.empId);
        System.out.println("This employee's department is: "+manager.employee.department);




    }
}
