package _26187_.q3;

public class Employee extends Manager {
    private String employeeName;
    private long employeeId;
    private String designation;
    private String contactNumber;

    public Employee(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String managerPhone,
                    String employeeName, long employeeId, String designation, String contactNumber) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, managerPhone);
        setEmployeeName(employeeName);
        setEmployeeId(employeeId);
        setDesignation(designation);
        setContactNumber(contactNumber);
    }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) throws PayrollDataException {
        if (employeeName == null || employeeName.trim().isEmpty()) throw new PayrollDataException("employeeName must not be empty");
        this.employeeName = employeeName.trim();
    }

    public long getEmployeeId() { return employeeId; }
    public void setEmployeeId(long employeeId) throws PayrollDataException {
        if (employeeId <= 0) throw new PayrollDataException("employeeId must be > 0");
        this.employeeId = employeeId;
    }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) throws PayrollDataException {
        if (designation == null || designation.trim().isEmpty()) throw new PayrollDataException("designation must not be empty");
        this.designation = designation.trim();
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws PayrollDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new PayrollDataException("contactNumber must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
