public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double get_perimeter() {
        double perimeter= 2 * ( this.height + this.width);
        return perimeter;
    }

    @Override
    double get_area() {
        double area= this.height * this.width ;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
