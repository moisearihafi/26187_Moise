package _26187_.q2;

import java.util.Scanner;

public final class StudentRecord extends Fee {

    public StudentRecord(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String teacherName, String subject, String teacherEmail, String phone,
                         String studentName, long rollNumber, String grade, String contactNumber,
                         String courseName, String courseCode, int creditHours,
                         String examName, String examDate,
                         int marksObtained, int maxMarks,
                         double tuitionFee, double otherCharges) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, examDate, marksObtained, maxMarks, tuitionFee, otherCharges);
    }

    public double calculateAverageMarks() {
        return getPercentage();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println(" Enter School (name address phone email):");
            String schoolName = sc.next();
            String address = sc.next();
            String phoneNumber = sc.next();
            String email = sc.next();

            System.out.println(" Enter Department (name code):");
            String departmentName = sc.next();
            String departmentCode = sc.next();

            System.out.println(" Enter Teacher (name subject email phone):");
            String teacherName = sc.next();
            String subject = sc.next();
            String teacherEmail = sc.next();
            String phone = sc.next();

            System.out.println(" Enter Student (name roll grade contact):");
            String studentName = sc.next();
            long rollNumber = Long.parseLong(sc.next());
            String grade = sc.next();
            String contactNumber = sc.next();

            System.out.println("Enter Course (name code creditHours):");
            String courseName = sc.next();
            String courseCode = sc.next();
            int creditHours = Integer.parseInt(sc.next());

            System.out.println(" Enter Exam (name date):");
            String examName = sc.next();
            String examDate = sc.next();

            System.out.println(" Enter Result (marksObtained maxMarks):");
            int marksObtained = Integer.parseInt(sc.next());
            int maxMarks = Integer.parseInt(sc.next());

            System.out.println(" Enter Fees (tuition other):");
            double tuitionFee = Double.parseDouble(sc.next());
            double otherCharges = Double.parseDouble(sc.next());

            StudentRecord record = new StudentRecord(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                    departmentName, departmentCode,
                    teacherName, subject, teacherEmail, phone,
                    studentName, rollNumber, grade, contactNumber,
                    courseName, courseCode, creditHours,
                    examName, examDate,
                    marksObtained, maxMarks,
                    tuitionFee, otherCharges);

            System.out.println("Student Name: " + record.getStudentName());
            System.out.println(" Roll Number: " + record.getRollNumber());
            System.out.println(" Grade: " + record.getGrade());
            System.out.println(" Contact: " + record.getContactNumber());
            System.out.println(" Course: " + record.getCourseName() + " (" + record.getCourseCode() + ")");
            System.out.println(" Exam: " + record.getExamName() + " on " + record.getExamDate());
            System.out.println(" Marks: " + record.getMarksObtained() + "/" + record.getMaxMarks());
            System.out.println(" Percentage: " + String.format("%.2f", record.calculateAverageMarks()) + "%");
            System.out.println(" Total Fees: " + String.format("%.2f", record.getTotalFee()));

        } catch (SchoolDataException sde) {
            System.out.println(" Error: " + sde.getMessage());
        } catch (Exception e) {
            System.out.println(" Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
