package problem3and4;

public class EquilateralTriangle extends Shape{
    private double side;

    public EquilateralTriangle(double side, String name){
        this.name = name;
        this.side = side;
    }

    @Override
    public String getArea() {
       double area = ((Math.sqrt(3)) / 4) * (this.side*this.side);
       return("Area: " + area);
    }

    @Override
    public String getPerimeter() {
       double perimeter = this.side + this.side + this.side;
       return("Perimeter: " + perimeter);
    }
    @Override
    public String getName(){
        return("Name: " + this.name);
    }

    @Override
	public void scale(double scalingFactor) {
        this.side = this.side* scalingFactor;
        System.out.println("ScAlE HAs BeEn Shaped!");
    }

}
