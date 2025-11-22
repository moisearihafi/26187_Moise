package _26187_.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;
    private double doctorFee;

    public Doctor(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone, double doctorFee) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);
        setDoctorName(doctorName);
        setSpecialization(specialization);
        setDoctorEmail(doctorEmail);
        setPhone(phone);
        setDoctorFee(doctorFee);
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) throws HospitalDataException {
        if (doctorName == null || doctorName.trim().isEmpty()) throw new HospitalDataException("doctorName must not be empty");
        this.doctorName = doctorName.trim();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) throws HospitalDataException {
        if (specialization == null || specialization.trim().isEmpty()) throw new HospitalDataException("specialization must not be empty");
        this.specialization = specialization.trim();
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) throws HospitalDataException {
        if (doctorEmail == null || !doctorEmail.matches("^\\S+@\\S+\\.\\S+$")) throw new HospitalDataException("invalid doctor email");
        this.doctorEmail = doctorEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws HospitalDataException {
        if (phone == null || !phone.matches("\\d{10}")) throw new HospitalDataException("doctor phone must be 10 digits");
        this.phone = phone;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) throws HospitalDataException {
        if (doctorFee < 0) throw new HospitalDataException("doctorFee must not be negative");
        this.doctorFee = doctorFee;
    }
}
