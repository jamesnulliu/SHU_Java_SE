public class StudentDegree {
    public void printStudentInfo(Student student){
        student.computeAverage();
        student.getPass();
        String degree = student.getDegree();
        System.out.println("----------------------------");
        System.out.println("Name: "+student.getName()+"\tGender: "+student.getGender());
        System.out.println("Birthday: "+student.getBirthday().toString());
        System.out.println("School: "+student.getSchool());
        System.out.println("StudentID: "+student.getStuID());
        System.out.println("Category: "+student.getCategory());
        System.out.println("Average Score: " + student.computeAverage());
        System.out.println("----------------------------");
    }
    public void issueDegree(Student student){
        System.out.println("Degree: "+student.getDegree());
    }
}
