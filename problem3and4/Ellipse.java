package problem3and4;

public class Ellipse extends Shape{
    private double axesA;
    private double axesB;

    public Ellipse(double axesA, double axesB, String name){
        this.axesA = Math.max(axesA, axesB);
        this.axesB = Math.min(axesA, axesB);
        this.name = name;
    }

    @Override
    public String getArea() {
       double area = (Math.PI * this.axesA * this.axesB);
       return("Area: " + area);
    }

    @Override
    public String getPerimeter() {
        double equation1 = 2*(this.axesA*this.axesA + this.axesB*this.axesB);
        double equation2 = (this.axesA - this.axesB) * (this.axesA - this.axesB) / 2;
        double equation3 = equation1 - equation2;
        double perimeter = Math.PI * Math.sqrt(equation3);
        return("Perimeter: " + perimeter);
    }
    @Override
    public String getName(){
        return("Name: " + this.name);
    }

    @Override
	public void scale(double scalingFactor) {
        this.axesA = this.axesA * scalingFactor;
        this.axesB = this.axesB * scalingFactor;
        System.out.println("Shape's been scaled");
    }

}
