public class Main {
    public static void main(String[] args) {

        Square square = new Square(4);
        Circle circle= new Circle(5);
        Ellipse ellipse= new Ellipse(6,8);
        Rectangle rectangle= new Rectangle(4,5);
        Square square1= new Square(8);


        Shape[] arr = {square, circle, ellipse, rectangle, square1};

        for( int i= 0; i < arr.length; i++){

            System.out.println("The perimeter of a "+ arr[i]+ "="+ arr[i].get_perimeter()+"\n"+"The area of a "+ arr[i]+ "="+ arr[i].get_area());
            System.out.println("");
        }
    }
}

