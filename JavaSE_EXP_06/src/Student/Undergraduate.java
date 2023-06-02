package Student;

public class Undergraduate extends Student implements Manageable{
    @Override
    public double computeAverage() {
        double sum = 0;
        for (double s : score) {
            sum += s;
        }
        average = sum / score.length;
        return average;
    }

    @Override
    public boolean getPass() {
        status = computeAverage() >= 60;
        return status;
    }

    @Override
    public String getDegree() {
        return getPass() ? Constants.ISSUE_UNDERGRADUATE_DEGREE : Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
    }

    @Override
    public void printInfo(){
        computeAverage();
        getPass();
        System.out.println("----------------------------");
        System.out.println("Name: "+getName()+"\tGender: "+getGender());
        System.out.println("Birthday: "+getBirthday().toString());
        System.out.println("School: "+getSchool());
        System.out.println("StudentID: "+getStuID());
        System.out.println("Category: "+getCategory());
        System.out.println("Average Score: " + computeAverage());
        System.out.println("----------------------------");
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    private double average;

}
