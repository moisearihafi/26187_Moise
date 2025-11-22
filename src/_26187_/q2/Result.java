package _26187_.q2;

public class Result extends Exam {
    private int marksObtained;
    private int maxMarks;

    public Result(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, long rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, String examDate,
                  int marksObtained, int maxMarks) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, examDate);
        setMarksObtained(marksObtained);
        setMaxMarks(maxMarks);
    }

    public int getMarksObtained() { return marksObtained; }
    public void setMarksObtained(int marksObtained) throws SchoolDataException {
        if (marksObtained < 0) throw new SchoolDataException("marksObtained must be >= 0");
        this.marksObtained = marksObtained;
    }

    public int getMaxMarks() { return maxMarks; }
    public void setMaxMarks(int maxMarks) throws SchoolDataException {
        if (maxMarks <= 0) throw new SchoolDataException("maxMarks must be > 0");
        this.maxMarks = maxMarks;
    }

    public double getPercentage() {
        if (maxMarks == 0) return 0.0;
        return ((double) marksObtained / maxMarks) * 100.0;
    }
}
