package _26187_.q2;

public class Fee extends Result {
    private double tuitionFee;
    private double otherCharges;
    private double totalFee;

    public Fee(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String phone,
               String studentName, long rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, String examDate,
               int marksObtained, int maxMarks,
               double tuitionFee, double otherCharges) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, examDate, marksObtained, maxMarks);
        setTuitionFee(tuitionFee);
        setOtherCharges(otherCharges);
        calculateTotalFee();
    }

    public double getTuitionFee() { return tuitionFee; }
    public void setTuitionFee(double tuitionFee) throws SchoolDataException {
        if (tuitionFee < 0) throw new SchoolDataException("tuitionFee must be >= 0");
        this.tuitionFee = tuitionFee;
    }

    public double getOtherCharges() { return otherCharges; }
    public void setOtherCharges(double otherCharges) throws SchoolDataException {
        if (otherCharges < 0) throw new SchoolDataException("otherCharges must be >= 0");
        this.otherCharges = otherCharges;
    }

    public double getTotalFee() { return totalFee; }
    public void calculateTotalFee() {
        this.totalFee = this.tuitionFee + this.otherCharges;
    }
}
