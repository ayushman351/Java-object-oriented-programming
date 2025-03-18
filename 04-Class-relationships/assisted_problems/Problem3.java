package assisted_problems;

import java.util.ArrayList;

class Company {
    static String companyName="Umbrella corporations";
    ArrayList<Department> departments=new ArrayList<>();
     
    // method to create department and add it to departments list in compnay
    void addDepartment(String departmentName){
        Department department=new Department(departmentName);
        // department.addEmployees(name, empId, role);
        departments.add(department);
    }
    
    void showDepartments(){
        for(int i=0;i<departments.size();i++){
            System.out.println("Department: "+departments.get(i).departmentName);
            System.out.println("Number of employees: "+departments.get(i).totalEmployees);

        }
    }

    void showEmployees(){
        for(int i=0;i<departments.size();i++){
            System.out.println("Employee: "+departments.get(i).employees.get(i).name);
            System.out.println("Employee ID: "+departments.get(i).employees.get(i).empId);
            System.out.println("Role: "+departments.get(i).employees.get(i).role);
            System.out.println("------------------------------------------------");
        }
    }

    
}

class Department {
    String departmentName;
    int totalEmployees=0;
    ArrayList<Employee> employees=new ArrayList<>();

    Department(String departmentName){
        this.departmentName=departmentName;
    }
    // method to create employee and add it to employees list
    void addEmployees(String name, int empId, String role){
        Employee employee=new Employee(name, empId, role);
        employees.add(employee);
        totalEmployees++;
    }


}

class Employee {
    String name;
    int empId;
    String role;

    Employee(String name, int empId, String role){
        this.name=name;
        this.empId=empId;
        this.role=role;
    }
}

public class Problem3 {

    public static void main(String[] args) {
        Company company=new Company();
        company.addDepartment("IT");
        company.addDepartment("Finance");

        company.departments.get(0).addEmployees("Eve", 301, "System adminstrator");
        company.departments.get(0).addEmployees("Alice", 302, "Software Developer");

        company.departments.get(1).addEmployees("Mike", 101, "Analyst");
        company.departments.get(1).addEmployees("Jenny", 203, "Manager");

        System.out.println("Company: "+Company.companyName);

        company.showDepartments();
        company.showEmployees();

        // company=null;
        // System.out.println(company.departments.get(0).departmentName);
        // if we delete company object every department and employees get deleted too i.e, composition.
        

    }
}


