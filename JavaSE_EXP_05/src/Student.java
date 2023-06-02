import java.util.Date;

public abstract class Student {
    public abstract boolean getPass();
    public abstract double computeAverage();
    public abstract String getDegree();

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }
    public Date getBirthday() {
        return birthday;
    }

    public String getSchool() {
        return school;
    }

    public String getStuID() {
        return stuID;
    }

    public String getCategory() {
        return category;
    }

    public double[] getScore() {
        return score;
    }

    public boolean isStatus() {
        return status;
    }

    public void setName(String theName){
        this.name = theName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    protected String name;
    protected char gender;
    protected Date birthday;
    protected String school;
    protected String stuID;
    protected String category;
    protected double[] score;
    protected boolean status;
}
