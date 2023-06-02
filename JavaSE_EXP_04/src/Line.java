public class Line {
    double calculate_length(){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    }
    public void set_a(double x, double y){
        a.x=x;
        a.y=y;
    }
    public void set_b(double x, double y){
        b.x = x;
        b.y = y;
    }
    Point a = new Point();
    Point b = new Point();
}
