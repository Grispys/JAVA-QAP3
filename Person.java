class Person {

    protected String myName; // name of the person protected int myAge; // person’s age protected String myGender; // “M” for male, “F” for female
    protected int myAge;
    protected String myGender;
    
    public Person(String name, int age, String gender) {
    
    myName = name; myAge = age ; myGender = gender; }

    public void setName(String name){
        myName = name;
    }
    public void setGender(String gender){
        myGender = gender;
    }
    public void setAge(int age){
        myAge = age;
    }


    public String toString() {
        return myName + ", age: "  + myAge + ", gender: " + myGender; 
    } 
}