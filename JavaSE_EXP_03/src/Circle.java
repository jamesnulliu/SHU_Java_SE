public class Circle implements two_dimention_cal {
    private double redius = 0;

    public Circle(double theRedius){
        redius = theRedius;
    }

    public void set_redius(double theRedius){
        redius = theRedius;
    }

    @Override
    public double cal_area() throws invalidPorperty {
        if (!check_validity()) {
            throw new invalidPorperty("Invalid redius!");
        }
        return Math.PI * redius * redius;
    }

    @Override
    public double cal_perimeter() throws invalidPorperty {
        if (!check_validity()) {
            throw new invalidPorperty("Invalid redius!");
        }
        return 2 * Math.PI * redius;
    }

    @Override
    public boolean check_validity() {
        return redius > 0;
    }
}
