package Student;

public class UndergraduateException extends Exception{
    private String message;
    public String WarnMess(){
        message = "Score not in range of [0,100]!";
        return message;
    }
}
