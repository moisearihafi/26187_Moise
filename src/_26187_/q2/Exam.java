package _26187_.q2;

public class Exam extends Course {
    private String examName;
    private String examDate;

    public Exam(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String teacherName, String subject, String teacherEmail, String phone,
                String studentName, long rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, String examDate) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);
        setExamName(examName);
        setExamDate(examDate);
    }

    public String getExamName() { return examName; }
    public void setExamName(String examName) throws SchoolDataException {
        if (examName == null || examName.trim().isEmpty()) throw new SchoolDataException("examName must not be empty");
        this.examName = examName.trim();
    }

    public String getExamDate() { return examDate; }
    public void setExamDate(String examDate) throws SchoolDataException {
        if (examDate == null || examDate.trim().isEmpty()) throw new SchoolDataException("examDate must not be empty");
        this.examDate = examDate.trim();
    }
}
