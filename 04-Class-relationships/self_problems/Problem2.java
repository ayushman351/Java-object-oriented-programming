package self_problems;

import java.util.ArrayList;
// this program show difference between aggregation and compostion relationship

class University {
    static String universityName="Chitkara University";
    ArrayList<Department> departments=new ArrayList<>();

    void addDepartment(String departmentName){
        departments.add(new Department(departmentName));
    }

    void showDepartments(){ // method to show departments in the university
        for(int i=0;i<departments.size();i++){
            System.out.println("Department: "+departments.get(i).departmentName);
        }System.out.println();
    }
}

class Department {
    String departmentName;
    ArrayList<Faculty> faculties=new ArrayList<>();
    
    Department(String departmentName){
        this.departmentName=departmentName;
    }
    
    void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }

    void showFaculty(){
        System.out.println("Department: "+departmentName);
        for(int i=0;i<faculties.size();i++){    
         System.out.println("Name: "+faculties.get(i).facultyName);
        }System.out.println();
    }
}

class Faculty {
    String facultyName;
    int id;
    
    Faculty(String facultyName, int id){
        this.facultyName=facultyName;
        this.id=id;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        University university=new University();
        // Department department1= new Department("CSE");
        university.addDepartment("Computer science engineering");
        university.addDepartment("Mechanical engineering");
        university.addDepartment("Artificial Intelligence");
        university.addDepartment("Electronic & communication");
        university.addDepartment("Law");
        university.addDepartment("Medical");

        Faculty faculty1=new Faculty("Mr Robert", 1101);
        Faculty faculty2=new Faculty("Ms Alice", 1201);
        Faculty faculty3=new Faculty("Ms Stacy", 1203);
        Faculty faculty4=new Faculty("Prof Charlie", 1302);
        Faculty faculty5=new Faculty("Sir Lewis", 1205);
        Faculty faculty6=new Faculty("Ms Margrett ", 1402);

        university.departments.get(0).addFaculty(faculty1);
        university.departments.get(0).addFaculty(faculty2);
        university.departments.get(1).addFaculty(faculty6);
        university.departments.get(1).addFaculty(faculty3);
        university.departments.get(1).addFaculty(faculty4);
        university.departments.get(2).addFaculty(faculty5);

        university.showDepartments();

        university.departments.get(0).showFaculty();
        university.departments.get(1).showFaculty();
        university.departments.get(2).showFaculty();

    


        

    }
}
