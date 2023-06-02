import Student.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Undergraduate underGraduate = new Undergraduate();
        underGraduate.setName("王小二");
        underGraduate.setGender('男');
        underGraduate.setBirthday(new Date("2022/6/1"));
        underGraduate.setSchool("上海大学");
        underGraduate.setStuID("11128981");
        underGraduate.setCategory(Constants.UNDERGRADUATE);
        underGraduate.setScore(new double[]{89.5, 82, 87, 73});
        underGraduate.setStatus(false);
        Master master = new Master();
        master.setName("李燕");
        master.setGender('女');
        master.setBirthday(new Date("1999/6/12"));
        master.setSchool("上海大学");
        master.setStuID("10306");
        master.setCategory(Constants.MASTER);
        master.setScore(new double[]{70, 52.5, 95, 88, 89, 91});
        master.setThesisLevel('B');
        master.setStatus(false);
        StudentDegree studentDegree = new StudentDegree();
        studentDegree.issueDegree(underGraduate);
        studentDegree.issueDegree(master);
    }
}