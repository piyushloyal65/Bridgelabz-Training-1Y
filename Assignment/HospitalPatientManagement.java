abstract class Patient {
    private int patientId;
    private String name;
    protected int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    double calculateBill() {
        return 5000;
    }

    public void addRecord(String record) {
        System.out.println(record);
    }
}