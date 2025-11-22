package _26187_.q1;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    private double totalBill;

    public Bill(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String doctorName, String specialization, String doctorEmail, String phone, double superDoctorFee,
                String nurseName, String shift, int yearsOfExperience,
                String patientName, int age, String gender, String contactNumber,
                String admissionDate, String roomNumber, double roomCharges,
                String diagnosis, String treatmentGiven, double treatmentCost,
                double doctorFeeParam, double medicineCostParam) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, superDoctorFee, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);
        setDoctorFee(doctorFeeParam);
        setMedicineCost(medicineCostParam);
        // totalBill will be computed later via generateBill
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) throws HospitalDataException {
        if (doctorFee <= 0) throw new HospitalDataException("doctorFee must be > 0");
        this.doctorFee = doctorFee;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) throws HospitalDataException {
        if (medicineCost <= 0) throw new HospitalDataException("medicineCost must be > 0");
        this.medicineCost = medicineCost;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}
