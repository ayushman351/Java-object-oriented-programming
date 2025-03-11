package access_modifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int roll, String name){
        this.rollNumber=roll;
        this.name=name;
    }
    
    public double getCgpa(){
        return cgpa;
    }

    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1=new Student(0351,"Ayushman");
        Student student2=new Student(0352,"Avantika");

        student1.setCgpa(7.52);
        student2.setCgpa(6.9);

        System.out.println(student1.name+" CGPA: "+student1.getCgpa());
        System.out.println(student2.name+" CGPA: "+student2.getCgpa());
        

    }
}
