package _26187_.q1;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone, double doctorFee,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, String roomNumber, double roomCharges,
                     String diagnosis, String treatmentGiven, double treatmentCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, doctorFee, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);
        setDiagnosis(diagnosis);
        setTreatmentGiven(treatmentGiven);
        setTreatmentCost(treatmentCost);
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) throws HospitalDataException {
        if (diagnosis == null || diagnosis.trim().isEmpty()) throw new HospitalDataException("diagnosis must not be empty");
        this.diagnosis = diagnosis.trim();
    }

    public String getTreatmentGiven() {
        return treatmentGiven;
    }

    public void setTreatmentGiven(String treatmentGiven) throws HospitalDataException {
        if (treatmentGiven == null || treatmentGiven.trim().isEmpty()) throw new HospitalDataException("treatmentGiven must not be empty");
        this.treatmentGiven = treatmentGiven.trim();
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(double treatmentCost) throws HospitalDataException {
        if (treatmentCost <= 0) throw new HospitalDataException("treatmentCost must be > 0");
        this.treatmentCost = treatmentCost;
    }
}
