package _26187_.q2;

public class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, long rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber);
        setCourseName(courseName);
        setCourseCode(courseCode);
        setCreditHours(creditHours);
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) throws SchoolDataException {
        if (courseName == null || courseName.trim().isEmpty()) throw new SchoolDataException("courseName must not be empty");
        this.courseName = courseName.trim();
    }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) throws SchoolDataException {
        if (courseCode == null || !courseCode.matches("[a-zA-Z0-9]{3,}")) throw new SchoolDataException("courseCode must be alphanumeric and at least 3 chars");
        this.courseCode = courseCode;
    }

    public int getCreditHours() { return creditHours; }
    public void setCreditHours(int creditHours) throws SchoolDataException {
        if (creditHours <= 0) throw new SchoolDataException("creditHours must be > 0");
        this.creditHours = creditHours;
    }
}
