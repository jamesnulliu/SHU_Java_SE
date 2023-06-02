public class ComputPower {
    static double compPower(double a, double b) {
        System.out.println("Input 2 doubles: " + a +' '+ b);
        return a * a + b * b;
    }

    static double comPower(Parameter p) {
        System.out.println("Input a Parameter: {" + p.a + ", " + p.b + "}");
        return p.a * p.a + p.b * p.b;
    }

}
