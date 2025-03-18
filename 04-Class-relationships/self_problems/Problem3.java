package self_problems;

import java.util.ArrayList;


class Hospital {
    static String name="City Hospital";

}  

class Doctor {
    String name;
    String speciality;
    ArrayList<Patient> patients=new ArrayList<>();
    
    Doctor(String name, String speciality){
        this.name=name;
        this.speciality=speciality;
    }
    // this method allow communication between doctor and patient 
    void consult(Patient patient){
        this.patients.add(patient);
        System.out.println(this.name+" is consulting "+patient.name);
        System.out.println();
        patient.doctors.add(this);
    
    }
    
    void showPatients(){
        System.out.println("Patients that "+this.name+" consulted: ");
        for(int i=0;i<patients.size();i++){
            System.out.println(patients.get(i).name);
        }System.out.println();
    }
}

class Patient {
    String name;
    String problem;
    int patientId;
    ArrayList<Doctor> doctors=new ArrayList<>();

    Patient(String name, String problem, int id){
        this.name=name;
        this.problem=problem;
        this.patientId=id;
    }

    void showDoctors(){
        System.out.println(this.name+" has consulted: ");
        for(int i=0;i<doctors.size();i++){
            System.out.println(doctors.get(i).name+" for "+this.problem);
        }System.out.println();
    }
}

public class Problem3 {

    public static void main(String[] args) {
        Hospital hospital=new Hospital();
        
        Doctor doctor1=new Doctor("Dr Pal", "Cardiovascular");
        Doctor doctor2=new Doctor("Dr Gwen", "Pediatrition");
        Doctor doctor3=new Doctor("Dr Jill", "Orthopedics");

        Patient patient1=new Patient("Alex", "Heart problem", 23);
        Patient patient2=new Patient("Fransis", "Back-pain", 35);
        Patient patient3=new Patient("Brittany", "Pediatrics", 63);

        doctor1.consult(patient1);
        doctor2.consult(patient3);
        doctor3.consult(patient2);

        doctor1.showPatients();

        patient1.showDoctors();
        patient2.showDoctors();



    }
}
