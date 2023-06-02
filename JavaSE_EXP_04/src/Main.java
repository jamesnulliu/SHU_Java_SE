import java.util.Objects;

public class Main {
    static void printLine(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        printLine("Question 01 -------------------------");
        double p1 = 3.9, p2 = -10.9;
        double result = ComputPower.compPower(p1,p2);
        System.out.println("Result: "+result);
        Parameter parameter = new Parameter();
        result = ComputPower.comPower(parameter);
        System.out.println("Result: "+result);
        printLine("-------------------------------------");
        printLine("Question 02 -------------------------");
        Q_02 q_02 = new Q_02();
        q_02.setY(10.9);
        Q_02.setX(9.8);
        printLine("Static: "+Q_02.getX());
        printLine("Non-static: "+q_02.getY());
        printLine("-------------------------------------");
        printLine("Question 03 -------------------------");
        Line line = new Line();
        line.set_a(4,1);
        line.set_b(1,5);
        printLine("Length of (4,1),(1,5): " + line.calculate_length());
        printLine("-------------------------------------");
    }

}

