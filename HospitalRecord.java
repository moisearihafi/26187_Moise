package _26187_.q1;

public final class HospitalRecord extends Bill {

    public HospitalRecord(long id, String createdDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email,
                          String departmentName, String departmentCode,
                          String doctorName, String specialization, String doctorEmail, String phone, double doctorFee,
                          String nurseName, String shift, int yearsOfExperience,
                          String patientName, int age, String gender, String contactNumber,
                          String admissionDate, String roomNumber, double roomCharges,
                          String diagnosis, String treatmentGiven, double treatmentCost,
                          double doctorFeeParam, double medicineCostParam) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, doctorFee, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost, doctorFeeParam, medicineCostParam);
    }

    public double generateBill() {
        double total = getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
        setTotalBill(total);
        return total;
    }

    private static void print(String s) {
        System.out.println("25873" + " " + s);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            print("Enter entity id (long > 0):");
            long id = Long.parseLong(sc.nextLine());

            print("Enter created date:");
            String createdDate = sc.nextLine();

            print("Enter updated date:");
            String updatedDate = sc.nextLine();

            print("Enter hospital name:");
            String hospitalName = sc.nextLine();

            print("Enter hospital address:");
            String address = sc.nextLine();

            print("Enter hospital phone (10 digits):");
            String hospitalPhone = sc.nextLine();

            print("Enter hospital email:");
            String hospitalEmail = sc.nextLine();

            print("Enter department name:");
            String deptName = sc.nextLine();

            print("Enter department code (alphanumeric >=3):");
            String deptCode = sc.nextLine();

            print("Enter doctor name:");
            String doctorName = sc.nextLine();

            print("Enter doctor specialization:");
            String specialization = sc.nextLine();

            print("Enter doctor email:");
            String doctorEmail = sc.nextLine();

            print("Enter doctor phone (10 digits):");
            String doctorPhone = sc.nextLine();

            print("Enter doctor fee (>0):");
            double doctorFee = Double.parseDouble(sc.nextLine());

            print("Enter nurse name:");
            String nurseName = sc.nextLine();

            print("Enter nurse shift (Day/Night):");
            String shift = sc.nextLine();

            print("Enter nurse years of experience (>=0):");
            int years = Integer.parseInt(sc.nextLine());

            print("Enter patient name:");
            String patientName = sc.nextLine();

            print("Enter patient age (>0):");
            int age = Integer.parseInt(sc.nextLine());

            print("Enter patient gender (Male/Female/Other):");
            String gender = sc.nextLine();

            print("Enter patient contact number (10 digits):");
            String contactNumber = sc.nextLine();

            print("Enter admission date:");
            String admissionDate = sc.nextLine();

            print("Enter room number:");
            String roomNumber = sc.nextLine();

            print("Enter room charges (>0):");
            double roomCharges = Double.parseDouble(sc.nextLine());

            print("Enter diagnosis:");
            String diagnosis = sc.nextLine();

            print("Enter treatment given:");
            String treatmentGiven = sc.nextLine();

            print("Enter treatment cost (>0):");
            double treatmentCost = Double.parseDouble(sc.nextLine());

            print("Enter medicine cost (>0):");
            double medicineCost = Double.parseDouble(sc.nextLine());

            HospitalRecord record = new HospitalRecord(id, createdDate, updatedDate, hospitalName, address, hospitalPhone, hospitalEmail,
                    deptName, deptCode,
                    doctorName, specialization, doctorEmail, doctorPhone, doctorFee,
                    nurseName, shift, years,
                    patientName, age, gender, contactNumber,
                    admissionDate, roomNumber, roomCharges,
                    diagnosis, treatmentGiven, treatmentCost,
                    doctorFee, medicineCost);

            print("--- Hospital Details ---");
            print("ID: " + record.getId());
            print("Created: " + record.getCreatedDate());
            print("Updated: " + record.getUpdatedDate());
            print("Hospital Name: " + record.getHospitalName());
            print("Address: " + record.getAddress());
            print("Phone: " + record.getPhoneNumber());
            print("Email: " + record.getEmail());

            print("--- Department ---");
            print("Department Name: " + record.getDepartmentName());
            print("Department Code: " + record.getDepartmentCode());

            print("--- Doctor ---");
            print("Doctor Name: " + record.getDoctorName());
            print("Specialization: " + record.getSpecialization());
            print("Doctor Email: " + record.getDoctorEmail());
            print("Doctor Phone: " + record.getPhone());
            print("Doctor Fee: " + record.getDoctorFee());

            print("--- Nurse ---");
            print("Nurse Name: " + record.getNurseName());
            print("Shift: " + record.getShift());
            print("Years Experience: " + record.getYearsOfExperience());

            print("--- Patient ---");
            print("Patient Name: " + record.getPatientName());
            print("Age: " + record.getAge());
            print("Gender: " + record.getGender());
            print("Contact: " + record.getContactNumber());

            print("--- Admission ---");
            print("Admission Date: " + record.getAdmissionDate());
            print("Room Number: " + record.getRoomNumber());
            print("Room Charges: " + record.getRoomCharges());

            print("--- Treatment ---");
            print("Diagnosis: " + record.getDiagnosis());
            print("Treatment Given: " + record.getTreatmentGiven());
            print("Treatment Cost: " + record.getTreatmentCost());

            print("--- Billing ---");
            print("Doctor Fee: " + record.getDoctorFee());
            print("Medicine Cost: " + record.getMedicineCost());

            double total = record.generateBill();
            print("Total Charges (room + treatment + doctor + medicine): " + total);
            print("Final Bill (generateBill): " + total);

        } catch (HospitalDataException hde) {
            System.out.println("25873" + " Error: " + hde.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("25873" + " Input error: number expected. " + nfe.getMessage());
        } catch (Exception e) {
            System.out.println("25873" + " Unexpected error: " + e.getMessage());
        }
    }
}
