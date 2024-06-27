
public class  Start {
    public static void main(String[] args) {
        Person person = new Person();
        person.giveName("Hans");
        System.out.println(person.getFirstName());

        person.giveLastName("Ebai");
        System.out.println(person.getLastName());

    }
}