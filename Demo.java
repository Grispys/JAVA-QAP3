public class Demo {
    
    public static void main(String[] args) {
        // create generic person
        Person bob = new Person("Coach Bob", 27, "M"); System.out.println(bob);
        // created students, teachers, collegestudents and printed them to show it works
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5); System.out.println(lynne);
    
        Teacher mrJava = new Teacher("Duke Java", "M", 34, 50000, "Computer Science");  System.out.println(mrJava);
    
        CollegeStudent ima = new CollegeStudent("english", 1, "Ima Frosh", 18, "f", "ID7fH2", 4.0);    
        System.out.println(ima);
    }

}
