package _26187_.q1;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String doctorName, String specialization, String doctorEmail, String phone, double doctorFee,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender, String contactNumber) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, doctorFee, nurseName, shift, yearsOfExperience);
        setPatientName(patientName);
        setAge(age);
        setGender(gender);
        setContactNumber(contactNumber);
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) throws HospitalDataException {
        if (patientName == null || patientName.trim().isEmpty()) throw new HospitalDataException("patientName must not be empty");
        this.patientName = patientName.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HospitalDataException {
        if (age <= 0) throw new HospitalDataException("age must be > 0");
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws HospitalDataException {
        if (gender == null) throw new HospitalDataException("gender must not be null");
        String g = gender.trim();
        if (!(g.equals("Male") || g.equals("Female") || g.equals("Other"))) throw new HospitalDataException("gender must be 'Male', 'Female' or 'Other'");
        this.gender = g;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) throws HospitalDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new HospitalDataException("contactNumber must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
