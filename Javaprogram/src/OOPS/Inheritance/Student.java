package OOPS.Inheritance;

public class Student {
    public static void main(String[] args) {
        StudentProfile s = new StudentProfile();
        s.setStudentName("suraj");
        s.setStudentEmail("surajaiswal5857@gmail.com");
        s.setStudentAddress("lucknow");
        s.setStudentMobileNo("9580587480");
        System.out.println(s.getStudentName() +"\n"+ s.getStudentEmail()+"\n"+s.getStudentAddress()+"\n"+s.getStudentMobileNo());
    }

}
class StudentProfile{
    String StudentName;
    String StudentEmail;
    String StudentAddress;
    String StudentMobileNo;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public String getStudentMobileNo() {
        return StudentMobileNo;
    }

    public void setStudentMobileNo(String studentMobileNo) {
        StudentMobileNo = studentMobileNo;
    }
}
