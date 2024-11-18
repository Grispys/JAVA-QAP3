package problem3and4;


public class Demo{

    public static void Scaling(Scalable[] Scalable, double scalingFactor){
        for (Scalable scalable : Scalable) {
            scalable.scale(scalingFactor);
        }
    }


    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5, "circle"); 
        shapes[1] = new Triangle(5, 6, 7, "Triangle");
        shapes[2] = new Ellipse(10, 13, "Ellipse");
        shapes[3] = new EquilateralTriangle(5, "ETriangle");
        System.out.println();
        System.out.println("BEFORE SCALING: ");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
        System.out.println();
        Scaling(shapes, 1.3);
        System.out.println();
        System.out.println("AFTER SCALING: ");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
   
}
