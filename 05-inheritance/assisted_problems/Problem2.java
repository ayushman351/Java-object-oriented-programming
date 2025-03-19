package assisted_problems;

class Employee {
    String name;
    int id;
    double salary;


    void showDetails(){
        System.out.println("Name: "+name+", id: "+id+", salary: "+salary);
    }

}

class Manager extends Employee {
    int teamSize;
    
    Manager(String name, int id, double salary, int teamSize){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.teamSize=teamSize;
    }

    void showDetails(){
        System.out.println("Name: "+name+", id: "+id+", salary: "+salary+", Team size: "+teamSize);
    }

}

class Developer extends Employee{
    String programmingLanguage;

    Developer(String name,int id, double salary, String language){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.programmingLanguage=language;
    }

    void showDetails(){
        System.out.println("Name: "+name+", id: "+id+", salary: "+salary+", programming language: "+programmingLanguage);
    }
}

class Intern extends Employee{
    String project;

    Intern(String name, int id, double salary, String project){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.project=project;
    }

    void showDetails(){
        System.out.println("Name: "+name+", id: "+id+", salary: "+salary+", project: "+project);
    }
}


public class Problem2 {
    
    public static void main(String[] args) {
        Employee employee1=new Manager("Steven",101,50000,55);
        Employee employee2=new Developer("Nathan", 201, 45000, "JAVA");
        Employee employee3=new Intern("Judy", 301, 35000, "backend-connections");

        employee1.showDetails();
        employee2.showDetails();
        employee3.showDetails();
        
    }
}
