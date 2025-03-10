package Level2;

public class StudentReport {
    public static void main(String[] args) {
        Student student1=new Student("Jessy", 1001, 85);
        student1.calculateGrade();
        student1.studentDetails();
    }
}

class Student{
    String name;
    int rollNum;
    double marks;
    char grade;

    Student(String name, int rollnumber, double marks){
        this.name=name;
        rollNum=rollnumber;
        this.marks=marks;
        
    }

    void calculateGrade(){
         if(marks>90){
          this.grade='A';
         }else if(marks>=80){
            this.grade='B';
         }else if(marks>=70){
            this.grade='C';
         }else if(marks>=60){
            this.grade='D';
         }else {
            this.grade='F';
         }
    }

    void studentDetails(){
        System.out.println("Name: "+name+", Roll number: "+rollNum+", marks: "+marks+", Grades: "+grade);
    }
}
