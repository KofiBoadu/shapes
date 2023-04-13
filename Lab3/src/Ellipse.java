public class Ellipse extends  Shape{

    public Ellipse(double height , double width){
        super(height, width);
    }


    @Override
    double get_perimeter() {
        double a = this.height / 2;
        double b = this.width / 2;
        double perimeter = Math.PI * (3 * (a+b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
        return perimeter;
    }

    @Override
    double get_area() {
        double a = this.height / 2;
        double b = this.width / 2;
       double area= Math.PI * a * b;
        return area;
    }


    @Override
    public String toString() {
        return "Ellipse{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
