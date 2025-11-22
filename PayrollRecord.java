package _26187_.q3;

import java.util.Scanner;

public final class PayrollRecord extends Salary {

    public PayrollRecord(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String managerName, String managerEmail, String managerPhone,
                         String employeeName, long employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction,
                         double basicSalary) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, managerPhone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary);
    }

    public double calculateNetSalary() {
        return getNetSalary();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println(" Enter Company (name address phone email):");
            String companyName = sc.next();
            String address = sc.next();
            String phoneNumber = sc.next();
            String email = sc.next();

            System.out.println(" Enter Department (name code):");
            String departmentName = sc.next();
            String departmentCode = sc.next();

            System.out.println(" Enter Manager (name email phone):");
            String managerName = sc.next();
            String managerEmail = sc.next();
            String managerPhone = sc.next();

            System.out.println(" Enter Employee (name id designation contact):");
            String employeeName = sc.next();
            long employeeId = Long.parseLong(sc.next());
            String designation = sc.next();
            String contactNumber = sc.next();

            System.out.println("Enter Attendance (totalDays presentDays leaveDays):");
            int totalDays = Integer.parseInt(sc.next());
            int presentDays = Integer.parseInt(sc.next());
            int leaveDays = Integer.parseInt(sc.next());

            System.out.println(" Enter Allowances (housing transport):");
            double housingAllowance = Double.parseDouble(sc.next());
            double transportAllowance = Double.parseDouble(sc.next());

            System.out.println(" Enter Deductions (tax loan):");
            double taxDeduction = Double.parseDouble(sc.next());
            double loanDeduction = Double.parseDouble(sc.next());

            System.out.println(" Enter Salary (basicSalary):");
            double basicSalary = Double.parseDouble(sc.next());

            PayrollRecord record = new PayrollRecord(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                    departmentName, departmentCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contactNumber,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction,
                    basicSalary);

            System.out.println(" Employee: " + record.getEmployeeName() + " (ID: " + record.getEmployeeId() + ")");
            System.out.println("Designation: " + record.getDesignation());
            System.out.println(" Attendance: " + record.getPresentDays() + "/" + record.getTotalDays() + " present, " + record.getLeaveDays() + " leave");
            System.out.println(" Total Allowances: " + String.format("%.2f", record.getTotalAllowances()));
            System.out.println(" Total Deductions: " + String.format("%.2f", record.getTotalDeductions()));
            System.out.println(" Basic Salary: " + String.format("%.2f", record.getBasicSalary()));
            System.out.println(" Gross Salary: " + String.format("%.2f", record.getGrossSalary()));
            System.out.println(" Net Salary: " + String.format("%.2f", record.calculateNetSalary()));

        } catch (PayrollDataException pde) {
            System.out.println(" Error: " + pde.getMessage());
        } catch (Exception e) {
            System.out.println(" Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
