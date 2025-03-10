package Level1;
public class EmployeeDetails{
    public static void main(String[] args) {
        Employee employee1=new Employee("Avantika",101,15000);
        Employee employee2=new Employee("Kritika", 100, 20000);

        employee1.displayDetails();
        employee2.displayDetails();

    }
    
}

class Employee{
    String name;
    int id;
    double salary;

    Employee(String name, int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("Name: "+name+", id: "+id+", salary: "+salary);
    }
}