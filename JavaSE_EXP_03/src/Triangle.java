public class Triangle implements two_dimention_cal {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Triangle(double aa, double bb, double cc) {
        a = aa;
        b = bb;
        c = cc;
    }

    // @param border_id 1->a; 2->b; 3->c;
    public void set_border(int border_id, double length) {
        switch (border_id) {
            case 1 -> a = length;
            case 2 -> b = length;
            case 3 -> c = length;
            default -> System.out.println("Invalid border_id!");
        }
    }

    @Override
    public boolean check_validity() {
        return !(a > 0) || !(b > 0) || !(c > 0) || !((a - b) * (a - b) < c * c) || !((a - c) * (a - c) < b * b) || !((b - c) * (b - c) < a * a);
    }

    @Override
    public double cal_perimeter() throws invalidPorperty {
        if (check_validity()) {
            throw new invalidPorperty();
        }
        return a + b + c;
    }

    @Override
    public double cal_area() throws invalidPorperty {
        if (check_validity()) {
            throw new invalidPorperty("Invalid border!");
        }
        double p = cal_perimeter() / 2;
        double D = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(D);
    }
}

