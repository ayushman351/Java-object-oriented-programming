class Patient{
    static String hospital="City Hospital";
    static int totalPatients=0;
    String name;
    int age;
    String ailment;
    final int patientId;

    Patient(String name, int age, String ailment,int patientId){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientId=patientId;
        totalPatients++;
    }
    static void getTotalPatients(){
        System.out.println("Total number of patients: "+totalPatients);
    }
    void patientDetails(Patient patient){
        if( patient instanceof Patient){
        System.out.println("Hospital: "+hospital);
        System.out.println("Patient name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Ailment: "+ailment);
        System.out.println("Patient ID: "+patientId);
        System.out.println();

        }
        
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Patient patient1=new Patient("Diana White", 29, "High Fever", 321);
        patient1.patientDetails(patient1);

        Patient.getTotalPatients();

    }
}
