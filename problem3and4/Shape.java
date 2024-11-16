package problem3and4;

public abstract class Shape {
    protected String name;

    abstract public String getArea();

    abstract public String getPerimeter();

    abstract public String getName();

    @Override
    public String toString(){
        return(this.getName() + " " + this.getArea() + " " + this.getPerimeter());
    }
    
    
}
