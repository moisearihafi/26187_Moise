package _26187_.q3;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String managerName, String managerEmail, String managerPhone,
                  String employeeName, long employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, managerPhone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        setBasicSalary(basicSalary);
        computeGrossAndNet();
    }

    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) throws PayrollDataException {
        if (basicSalary <= 0) throw new PayrollDataException("basicSalary must be > 0");
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary() { return grossSalary; }
    public double getNetSalary() { return netSalary; }

    public void computeGrossAndNet() {
        this.grossSalary = this.basicSalary + getTotalAllowances();
        this.netSalary = this.basicSalary + getTotalAllowances() - getTotalDeductions();
    }
}
