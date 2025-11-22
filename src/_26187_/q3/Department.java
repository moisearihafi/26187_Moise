package _26187_.q3;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        setDepartmentName(departmentName);
        setDepartmentCode(departmentCode);
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) throws PayrollDataException {
        if (departmentName == null || departmentName.trim().isEmpty()) throw new PayrollDataException("departmentName must not be empty");
        this.departmentName = departmentName.trim();
    }

    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) throws PayrollDataException {
        if (departmentCode == null || !departmentCode.matches("[a-zA-Z0-9]{3,}")) throw new PayrollDataException("departmentCode must be alphanumeric and at least 3 chars");
        this.departmentCode = departmentCode;
    }
}
