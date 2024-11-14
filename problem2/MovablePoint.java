package problem2;


public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // constructor uses the point class super to set x and y
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){
        this.xSpeed = 1.0f;
        this.ySpeed = 1.0f;
    }

    // sets and gets all the variables
    public float getxSpeed(){
        return(this.xSpeed);
    }
    public float getySpeed(){
        return(this.ySpeed);
    }

    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }

    public String toString(){
        return super.toString() + ", Speed = (" + this.xSpeed + "," + this.ySpeed + ")"; 
    }

    // uses setx and getx/y from point class to move the point around the imaginary planes
    public MovablePoint move(){
        setX(getX() +xSpeed);
        setY(getY() +ySpeed);
        return this;
    }
}
