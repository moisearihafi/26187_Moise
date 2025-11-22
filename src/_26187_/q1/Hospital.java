package _26187_.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);
        setHospitalName(hospitalName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) throws HospitalDataException {
        if (hospitalName == null || hospitalName.trim().isEmpty()) throw new HospitalDataException("hospitalName must not be empty");
        this.hospitalName = hospitalName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws HospitalDataException {
        if (address == null || address.trim().isEmpty()) throw new HospitalDataException("address must not be empty");
        this.address = address.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws HospitalDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new HospitalDataException("phoneNumber must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws HospitalDataException {
        if (email == null || !email.matches("^\\S+@\\S+\\.\\S+$")) throw new HospitalDataException("invalid email format");
        this.email = email;
    }
}
