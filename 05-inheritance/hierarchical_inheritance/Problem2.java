package hierarchical_inheritance;

class Person {
    String name;
    int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void displayRole(){
        System.out.println("This is a Person");
        System.out.println("Name: "+name+", age: "+age);
        System.out.println();
    }

}
class Student extends Person{
    int rollNum;

    Student(int rollNum, String name, int age){
        super(name, age);
        this.rollNum=rollNum;
    }

    void displayRole(){
        System.out.println("This is a student!");
        System.out.println("Name: "+name+", age: "+age+", roll number: "+rollNum);
        System.out.println();
    }

}
class Teacher extends Person{
    String subject;

    Teacher(String subject, String name, int age){
        super(name, age);
        this.subject=subject;
    }

    void displayRole(){
        System.out.println("This is a Teacher!");
        System.out.println("Name: "+name+", age: "+age+", subject: "+subject);
        System.out.println();
    }

}
class Staff extends Person{
    String job;

    Staff(String job, String name, int age){
        super(name, age);
        this.job=job;
    }

    void displayRole(){
        System.out.println("This a is staff member!");
        System.out.println("Name: "+name+", age: "+age+", job: "+job);
        System.err.println();
    }

}

public class Problem2 {
    public static void main(String[] args) {
        Person student = new Student(301, "David", 15);
        Person teacher =new Teacher("Science", "Sir Lewis", 45);
        Person staff=new Staff("Janitor", "Seth", 37);

        student.displayRole();
        teacher.displayRole();
        staff.displayRole();
    }
}
