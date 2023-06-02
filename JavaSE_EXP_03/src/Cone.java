public class Cone {
    private Circle bottom = new Circle(1);
    private double height = 0;

    public Cone(double theRedius, double theHeight){
        bottom.set_redius(theRedius);
        height = theHeight;
    }

    public Cone(Circle theBottom, double theHeight){
        bottom = theBottom;
        height = theHeight;
    }

    public void set_bottomRedius(double theRedius){
        bottom.set_redius(theRedius);
    }

    public double cal_volume() {
        try{
            return bottom.cal_area()* height / 3;
        } catch (invalidPorperty e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
