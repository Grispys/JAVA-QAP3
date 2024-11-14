package problem1;

public class Student extends Person { 
    protected String myIdNum;
    protected int myAge;
    protected String gender;
    protected String idNum;
    protected double myGpa;

    public Student(String name, int age, String gender, String idNum, double gpa) { // use the super class’ constructor super(name, age, gender);
        super(name, age, gender);
    // initialize what’s new to Student
        myIdNum = idNum;
        myGpa = gpa;
    }

    public void setId(String idNum){
        myIdNum = idNum;
    }

    public void setGpa(double gpa){
        myGpa = gpa;
    }

    public String getId(){
        return("Id: " + this.myIdNum);
    }

    public String getGpa(){
        return("GPA: " + this.myGpa);
    }
}