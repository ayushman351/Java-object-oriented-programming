abstract class Patient {
    private int patientId;
    String name;
    int age;
    double bill;
    private String medicalRecord;// keeping record private as it's confidential


    Patient(int patientId, String name, int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }
    
    public String getMedicalRecord() {
        return medicalRecord;
    }
    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    void getPatientDetails(){
        System.out.println("Patient ID: "+patientId+", Name: "+name+", age: "+age);
    }

    abstract void calculateBill();
}


interface MedicalRecords {
    void addRecord(String medicalRecord);
    void viewRecord();

}


class InPatient extends Patient implements MedicalRecords{
    int numberOfDays;
    double roomCharge;
    double treatmentCost;

    InPatient(int patientId, String name, int age, int numberOfDays, double roomCharge, double treatmentCost){
        super(patientId, name, age);
        this.numberOfDays=numberOfDays;
        this.roomCharge=roomCharge;
        this.treatmentCost=treatmentCost;
    }

    @Override
    void calculateBill() {
        bill=(numberOfDays*roomCharge)+treatmentCost;
        System.out.println("Total bill for "+name+": "+bill );
    }

    @Override
    public void addRecord(String medicalRecord) {
        setMedicalRecord(medicalRecord);
    }

    @Override
    public void viewRecord() {
        System.out.println(getMedicalRecord());
    }

}


class OutPatient extends Patient implements MedicalRecords{
    double consultationFee;
    double medicationCost;

    OutPatient(int patientId, String name, int age, double consultationFee, double medicationCost){
        super(patientId, name, age);
        this.medicationCost=medicationCost;
        this.consultationFee=consultationFee;
    }

    @Override
    void calculateBill() {
        bill=consultationFee+medicationCost;
        System.out.println("Total bill for "+name+": "+bill );
    }

    @Override
    public void addRecord(String medicalRecord) {
        setMedicalRecord(medicalRecord);
    }

    @Override
    public void viewRecord() {
        System.out.println(getMedicalRecord());
    }


}
public class HospitalManagement {
    public static void main(String[] args) {
        Patient patient1=new InPatient(111, "Samantha", 26,5,1000,2500);
        Patient patient2=new OutPatient(211, "Jessy", 29,500,1000);

        patient1.getPatientDetails();
        patient1.calculateBill();
        MedicalRecords recordsOfPatient1=(MedicalRecords)patient1;// typecasting to access the abstract methods in interface MedicalRecords
        recordsOfPatient1.addRecord("Samantha was admitted, Diagonosis: cardiovascular disease, Treatment: Ongoing");
        recordsOfPatient1.viewRecord();
        System.out.println();


        patient2.getPatientDetails();
        patient2.calculateBill();
        MedicalRecords recordsOfPatient2=(MedicalRecords)patient2;// again typecasting
        recordsOfPatient2.addRecord("Jessy had a routine checkup, Diagonosis: Seasonal Allergies, Treatment: Antihistamines");
        recordsOfPatient2.viewRecord();



        
    }
}
