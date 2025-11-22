package _26187_.q1;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
        setDepartmentName(departmentName);
        setDepartmentCode(departmentCode);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) throws HospitalDataException {
        if (departmentName == null || departmentName.trim().isEmpty()) throw new HospitalDataException("departmentName must not be empty");
        this.departmentName = departmentName.trim();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) throws HospitalDataException {
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) throw new HospitalDataException("departmentCode must be alphanumeric and at least 3 chars");
        this.departmentCode = departmentCode;
    }
}
