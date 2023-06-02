public class Master extends Student {
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
        status = computeAverage() >= 80 && getThesisLevel() <= 'C';
        return status;
    }

    @Override
    public String getDegree() {
        return getPass() ? Constants.ISSUE_MASTER_DEGREE : Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE;
    }

    public double getAverage() {
        return average;
    }

    public char getThesisLevel() {
        return thesisLevel;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setThesisLevel(char theThesisLevel) {
        switch (theThesisLevel) {
            case 'A', 'B', 'C', 'D', 'E' -> {
            }
            default -> theThesisLevel = 'E';
        }
        this.thesisLevel = theThesisLevel;
    }

    protected double average;
    protected char thesisLevel;
}
