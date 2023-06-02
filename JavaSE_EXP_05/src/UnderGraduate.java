public class UnderGraduate extends Student {
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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    private double average;

}
