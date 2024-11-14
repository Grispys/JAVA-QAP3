package problem2;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    // i guess this is a default method that makes a 1 1 point
    public Point(){
        this.x = 1;
        this.y = 1;
    }

    // all the sets and gets
    public float getX(){
        return(this.x);
    }
    
    public float getY(){
        return(this.y);
    }

    public void setX(float x){
        this.x = x;
    }
    
    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x; this.y = y;
    }
    
    public float[] getXY(){
        return new float[]{this.x, this.y};
    }
    // overrides the default tostring
    @Override
    public String toString(){
        return("(" + getX() + "," + getY() + ")");
    }




}
