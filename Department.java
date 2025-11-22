package _26187_.q2;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        setDepartmentName(departmentName);
        setDepartmentCode(departmentCode);
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) throws SchoolDataException {
        if (departmentName == null || departmentName.trim().isEmpty()) throw new SchoolDataException("departmentName must not be empty");
        this.departmentName = departmentName.trim();
    }

    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) throws SchoolDataException {
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) throw new SchoolDataException("departmentCode must be alphanumeric and at least 3 chars");
        this.departmentCode = departmentCode;
    }
}
