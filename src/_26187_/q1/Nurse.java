package _26187_.q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                 String departmentName, String departmentCode,
                 String doctorName, String specialization, String doctorEmail, String phone, double doctorFee,
                 String nurseName, String shift, int yearsOfExperience) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, doctorFee);
        setNurseName(nurseName);
        setShift(shift);
        setYearsOfExperience(yearsOfExperience);
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) throws HospitalDataException {
        if (nurseName == null || nurseName.trim().isEmpty()) throw new HospitalDataException("nurseName must not be empty");
        this.nurseName = nurseName.trim();
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) throws HospitalDataException {
        if (shift == null || !(shift.equals("Day") || shift.equals("Night"))) throw new HospitalDataException("shift must be 'Day' or 'Night'");
        this.shift = shift;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) throws HospitalDataException {
        if (yearsOfExperience < 0) throw new HospitalDataException("yearsOfExperience must be >= 0");
        this.yearsOfExperience = yearsOfExperience;
    }
}
