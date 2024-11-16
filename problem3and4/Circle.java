package problem3and4;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius, String name){
        this.radius = radius;
        this.name = name;
    }
    
    
    
    @Override
    public String getArea() {
       double area = (Math.PI * (this.radius * this.radius));
       return("Area: " + area);
    }

    @Override
    public String getPerimeter() {
       double perimeter = (2 * Math.PI * this.radius);
       return("Perimeter: " + perimeter);
    }
    @Override
    public String getName(){
        return("Name: " + this.name);
    }

}
