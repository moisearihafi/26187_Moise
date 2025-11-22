package _26187_.q2;

public class Student extends Teacher {
    private String studentName;
    private long rollNumber;
    private String grade;
    private String contactNumber;

    public Student(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone,
                   String studentName, long rollNumber, String grade, String contactNumber) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone);
        setStudentName(studentName);
        setRollNumber(rollNumber);
        setGrade(grade);
        setContactNumber(contactNumber);
    }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) throws SchoolDataException {
        if (studentName == null || studentName.trim().isEmpty()) throw new SchoolDataException("studentName must not be empty");
        this.studentName = studentName.trim();
    }

    public long getRollNumber() { return rollNumber; }
    public void setRollNumber(long rollNumber) throws SchoolDataException {
        if (rollNumber <= 0) throw new SchoolDataException("rollNumber must be > 0");
        this.rollNumber = rollNumber;
    }

    public String getGrade() { return grade; }
    public void setGrade(String grade) throws SchoolDataException {
        if (grade == null || grade.trim().isEmpty()) throw new SchoolDataException("grade must not be empty");
        this.grade = grade.trim();
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws SchoolDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new SchoolDataException("contactNumber must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
