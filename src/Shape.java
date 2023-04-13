public abstract class Shape {
    protected double height;
    protected double width ;



    public Shape  (double height, double width){
        this.height= height;
        this.width= width;
    }



    abstract double get_perimeter();
    abstract double get_area();

}

//ask why the circle class is inheriting height and width especially if its not entirely true
//why an ellipse should be inheriting from shape ,

