public class Person {
    private int age;
    private String firstName;
    private String lastName;

    public void giveName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }


    public void giveLastName(String lastName) {
       this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
