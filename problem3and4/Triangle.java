package problem3and4;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double sideA, double sideB, double sideC, String name){
        if (sideA + sideB >= sideC || sideA + sideC >= sideB || sideB + sideC >= sideA) {
            this.name = name;
            this.side1 = sideA;
            this.side2 = sideB;
            this.side3 = sideC; 
        }else{
            throw new IllegalArgumentException("Error: Triangle is not valid");
        }
        
        
    }


    @Override
    public String getArea() {
       double S = (this.side1 + this.side2 + this.side3) / 2;
       double equation1 = S - this.side1;
       double equation2 = S - this.side2;
       double equation3 = S - this.side3;
       double equation4 = S * equation1 * equation2 * equation3;
       double area = Math.sqrt(equation4);
       return("Area: " + area);
    }

    @Override
    public String getPerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        return("Perimeter: " + perimeter);
    }
    @Override
    public String getName(){
        return("Name: " + this.name);
    }
}
