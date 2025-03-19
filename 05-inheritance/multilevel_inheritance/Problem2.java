package multilevel_inheritance;

class Course {
    String courseName;
    String duration;
    
    Course(String courseName, String duration){
        this.courseName=courseName;
        this.duration=duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String platform, boolean isRecorded, String courseName, String duration){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    void courseDetails(){
        System.out.println("Platform: "+platform+", Recorded: "+isRecorded+", Course Name: "+courseName+", Duration: "+duration);
    }
}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    int discount;

    PaidOnlineCourse(double fee, int discount, String platform, boolean isRecorded, String courseName, String duration){
        super(platform, isRecorded, courseName, duration);
        this.fee=fee;
        this.discount=discount;
    }
     
    void courseDetails(){
        System.out.println("Platform: "+platform+", Recorded: "+isRecorded+", Course Name: "+courseName+", Duration: "+duration+", Fee: "+fee+", Discout: "+discount);
    }

    }

public class Problem2 {
    public static void main(String[] args) {
        OnlineCourse onlineCourse=new PaidOnlineCourse(4999, 15, "Coursera", true, "Algorithms", "120 days");

        onlineCourse.courseDetails();
    }
}
