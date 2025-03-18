package self_problems;

import java.util.ArrayList;

class Student {
    String name;
    int rollnum;
    ArrayList<Course> enrolledCourses=new ArrayList<>();

    Student(String name, int rollnum){
        this.name=name;
        this.rollnum=rollnum;
    }
    
    void enroll(Course course){
        enrolledCourses.add(course);
        course.enrolledStudents.add(this);
        System.out.println(this.name+" enrolled in "+course.courseName);
    }


}

class Professor {
   String name;
   ArrayList<Course>teachCourses=new ArrayList<>();

   Professor(String name){
    this.name=name;
   }
   
}

class Course {
    String courseName;
    String duration;
    double fee;
    Professor professor;
    ArrayList<Student> enrolledStudents=new ArrayList<>();
    

    Course(String courseName, String duration, double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    void assignProfessor(Professor professor){
        this.professor=professor;
        System.out.println(professor.name+" is assigned to "+courseName);

    }

}



public class Problem5 {
    public static void main(String[] args) {
        Student student1=new Student("Raven", 21);
        Student student2=new Student("Alec", 25);

        Course course1=new Course("System Design", "150 days", 599);
        Course course2=new Course("DSA", "180 days", 699);

        Professor professor=new Professor("Miss Misty");
        Professor professor2=new Professor("Sir Lewis");

        student1.enroll(course1);
        student2.enroll(course2);

        course1.assignProfessor(professor);
        course2.assignProfessor(professor2);

    }
}
