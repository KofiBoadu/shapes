public class Square extends Rectangle{
    public Square(double side) {
        super(side,side);
    }



    @Override
    double get_perimeter(){
        double perimeter = this.height * this.width;
        return perimeter;

    }

    @Override
    double get_area(){
        double area= this.height * this.height;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
