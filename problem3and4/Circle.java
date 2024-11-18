package problem3and4;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius, String name){
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


// heres the implemented scale method for problem 4, same goes for the other classes
// i dont feel like typing this comment out for each class lol
	@Override
	public void scale(double scalingFactor) {
        this.radius = this.radius * scalingFactor;
        System.err.println("Shape has been scaled. ");
    }

}
