package instance_vs_classes;

class Course {
    String courseName;
    int duration;
    double fee;
    static String institute;

    Course(String name, int duration, double fee){
        this.courseName=name;
        this.duration=duration;
        this.fee=fee;

    }
    void courseDetails(){
        System.out.println("Course name: "+courseName+"\nDuration: "+duration+" days\nFee: "+fee);
        System.out.println();
    }

    static void updateInstituteName(String newName){
        Course.institute=newName;
        System.out.println("Institute Name updated: "+newName);
    }
}
public class CourseManagement {
    public static void main(String[] args) {
        Course course1=new Course("Data Structures and alogithms", 120, 5999);
        Course course2=new Course("System Design", 100, 4999);
        Course course3=new Course("Spring Boot framwork", 150, 8999);
        
        Course.institute="Udemy";

        course1.courseDetails();
        course2.courseDetails();
        course3.courseDetails();

        Course.updateInstituteName("Coursera");
    }
}
