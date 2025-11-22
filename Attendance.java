package _26187_.q3;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode,
                      String managerName, String managerEmail, String managerPhone,
                      String employeeName, long employeeId, String designation, String contactNumber,
                      int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, managerPhone, employeeName, employeeId, designation, contactNumber);
        setTotalDays(totalDays);
        setPresentDays(presentDays);
        setLeaveDays(leaveDays);
    }

    public int getTotalDays() { return totalDays; }
    public void setTotalDays(int totalDays) throws PayrollDataException {
        if (totalDays < 0) throw new PayrollDataException("totalDays must be >= 0");
        this.totalDays = totalDays;
    }

    public int getPresentDays() { return presentDays; }
    public void setPresentDays(int presentDays) throws PayrollDataException {
        if (presentDays < 0) throw new PayrollDataException("presentDays must be >= 0");
        if (this.totalDays > 0 && presentDays > this.totalDays) throw new PayrollDataException("presentDays cannot exceed totalDays");
        this.presentDays = presentDays;
    }

    public int getLeaveDays() { return leaveDays; }
    public void setLeaveDays(int leaveDays) throws PayrollDataException {
        if (leaveDays < 0) throw new PayrollDataException("leaveDays must be >= 0");
        this.leaveDays = leaveDays;
    }
}
