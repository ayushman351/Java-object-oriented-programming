class Employee {
    static String companyName="Umbrella Corporations";
    String name;
    final int id;
    String designation;
    static int totalEmployees=0;

    Employee(String name, int id, String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }
    static void showTotalEmployees(){
        System.out.println("Total number of employees: "+totalEmployees);
    }
    void employeeDetails(){
        if(this instanceof Employee){
            System.out.println("Company Name: "+companyName);
            System.out.println("Name: "+name);
            System.out.println("Employee ID: "+id);
            System.out.println("Designation: "+designation);
            System.out.println();
        }

    }

}
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee employee1=new Employee("Mary Jane", 501, "Analyst");
        Employee employee2=new Employee("Robert Keene", 563, "Frotend developer");

        employee1.employeeDetails();
        employee2.employeeDetails();

        Employee.showTotalEmployees();
    }
}
