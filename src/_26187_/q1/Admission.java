package _26187_.q1;

public class Admission extends Patient {
    private String admissionDate;
    private String roomNumber;
    private double roomCharges;

    public Admission(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone, double doctorFee,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, String roomNumber, double roomCharges) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, doctorFee, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber);
        setAdmissionDate(admissionDate);
        setRoomNumber(roomNumber);
        setRoomCharges(roomCharges);
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) throws HospitalDataException {
        if (admissionDate == null || admissionDate.trim().isEmpty()) throw new HospitalDataException("admissionDate must not be empty");
        this.admissionDate = admissionDate.trim();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) throws HospitalDataException {
        if (roomNumber == null || roomNumber.trim().isEmpty()) throw new HospitalDataException("roomNumber must not be empty");
        this.roomNumber = roomNumber.trim();
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) throws HospitalDataException {
        if (roomCharges <= 0) throw new HospitalDataException("roomCharges must be > 0");
        this.roomCharges = roomCharges;
    }
}
