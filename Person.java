class Person {

    protected String myName; // name of the person protected int myAge; // person’s age protected String myGender; // “M” for male, “F” for female
    protected int myAge;
    protected String myGender;
    // inital constructor
    public Person(String name, int age, String gender) {
        myName = name; myAge = age ; myGender = gender; 
    }


    // the set and get methods are simple enough. they're pretty much the exact same for every other class
    public void setName(String name){
        myName = name;
    }
    public void setGender(String gender){
        myGender = gender;
    }
    public void setAge(int age){
        myAge = age;
    }

    public String getName(){
        return("Name: " + this.myName);
    }
    public String getGender(){
        return("Gender: " + this.myGender);
    }
    public String getAge(){
        return("Age: " + this.myAge);
    }


    public String toString() {
        return myName + ", age: "  + myAge + ", gender: " + myGender; 
    } 
}