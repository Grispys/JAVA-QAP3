package problem3and4;


public class Demo{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5, "circle"); 
        shapes[1] = new Triangle(5, 6, 7, "Triangle");
        shapes[2] = new Ellipse(10, 13, "Ellipse");
        shapes[3] = new EquilateralTriangle(5, "ETriangle");

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
   
}
