class Student{
    static String university="Chitkara University";
    String name;
    final int rollNum;
    char grade;
    static int totalStudents=0;

    Student(String name, int rollNum, char grade){
        this.name=name;
        this.rollNum=rollNum;
        this.grade=grade;
        totalStudents++;
    }

    static void showTotalStudents(){
        System.out.println("Total number of students: "+totalStudents);
    }

    void studentDetails(){
        if(this instanceof Student ){
            System.out.println("University: "+university);
            System.out.println("Name: "+name);
            System.out.println("Roll number: "+rollNum);
            System.out.println("Grade: "+grade);
            System.out.println();
        }
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Student student=new Student("Ayushman Dixit", 351, 'A');

        student.studentDetails();

        Student.showTotalStudents();
    }
}
