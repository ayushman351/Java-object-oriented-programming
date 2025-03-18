package self_problems;
import java.util.ArrayList;

class School {
    static String schoolName="Public School";
    ArrayList<Student> students=new ArrayList<>();

    void addStudent(Student student){
    students.add(student);
    }

    void showStudent(){
    for(int i=0;i<students.size();i++){
        System.out.println("Name: "+students.get(i).name+", roll number: "+students.get(i).rollNum);
    }
    }
}

class Student {
    String name;
    int rollNum;
    ArrayList<Course> enrolledCourses=new ArrayList<>();

    Student(String name, int rollNum){
        this.name=name;
        this.rollNum=rollNum;
    }
    void enroll(Course course){
        enrolledCourses.add(course);
        course.enrolledStudents.add(this);// adding this student to the list of enrolledStudents in course
    }

    void showCourses(){
        for(int i=0;i<enrolledCourses.size();i++){
            System.out.println(enrolledCourses.get(i).courseName+" | "+enrolledCourses.get(i).duration+" | "+enrolledCourses.get(i).fee);
            
        }System.out.println();
    }
}

class Course {
    String courseName;
    String duration;
    double fee;
    ArrayList<Student> enrolledStudents=new ArrayList<>();

    Course(String courseName, String duration,double fee){
        this.courseName=courseName;
        this.fee=fee;
        this.duration=duration;
    }
}



class Problem1 {
public static void main(String[] args) {
    School school=new School();

    Student student1=new Student("James", 101);
    Student student2=new Student("Sarah", 102);
    Student student3=new Student("Claire", 103);
    Student student4=new Student("Zora", 104);

    Course course1=new Course("Engineering Math", "100 days", 299);
    Course course2=new Course("Computer Networks", "90 days", 399);
    Course course3=new Course("System Design", "120 days", 299);

    school.addStudent(student1);
    school.addStudent(student2);
    school.addStudent(student3);
    school.addStudent(student4);

    student1.enroll(course1);
    student1.enroll(course3);
    student2.enroll(course3);
    student3.enroll(course3);
    student4.enroll(course3);
    student4.enroll(course2);
    student4.enroll(course1);

    student1.showCourses();
    student2.showCourses();
    student3.showCourses();
    student4.showCourses();

    school.showStudent();
}
    
}