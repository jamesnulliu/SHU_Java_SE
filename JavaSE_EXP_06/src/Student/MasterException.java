package Student;

public class MasterException extends Exception{
    private String message;
    String WarnMess(int situation){
        switch (situation){
            case 1->{ message = "Score not in range of [0,100]!"; }
            case 2->{ message = "IssueDegree not of {A,B,C,D,E}!"; }
        }
        return message;
    }

}
