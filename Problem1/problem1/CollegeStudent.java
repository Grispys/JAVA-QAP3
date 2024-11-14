package problem1;
public class CollegeStudent extends Student{
    protected String major;
    protected int year;

    public CollegeStudent(String majorCourse, int currentYear, String name, int age, String gender, String idNum, double gpa){
        super(name, age, gender, idNum, gpa);
        this.major = majorCourse;
        this.year = currentYear;
    }
    public void setMajor(String majorCourse){
        this.major = majorCourse;
    }

    public void setYear(int currentYear){
        this.year = currentYear;
    }

    public String getMajor(){
        return("Major: " + this.major);
    }

    public String getYear(){
        return("Year: " + this.year);
    }

    // uses the super of the original toString and then adds on the new stuff from this class
    public String toString() {
        return  super.toString() + " Year: " + year + " Major: " + major;
    } 
}
