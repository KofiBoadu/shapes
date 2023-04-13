public class Circle extends Ellipse{
    public Circle(double diameter) {
        super(diameter,diameter);
    }



    @Override
    double get_perimeter(){
        double radius = this.height / 2.0;
        double circumference = 2.0 * Math.PI * radius;
        return circumference;
    }



    @Override
    double get_area(){
      double radius= this.height/2.0;
      double area= Math.PI * radius * radius;
      return area;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
