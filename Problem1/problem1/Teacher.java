package problem1;
public class Teacher extends Person{
    protected String subject;
    protected double salary;
    protected int myAge;
    protected String gender;

    public Teacher(String name, String Gender, int myAge, double pay, String teaches){
        super(name, myAge, Gender);
        subject = teaches;
        salary = pay;
    }

    public void setSubject(String teaches){
        this.subject = teaches;
    }

    public void setGpa(double pay){
        this.salary = pay;
    }

    public String getSubject(){
        return("Subject: " + this.subject);
    }

    public String getPay(){
        return("Salary: " + this.salary);
    }
    
    public String toString() {
        return  super.toString() + " Salary: " + salary + " Subject: " + subject;
    } 
}
