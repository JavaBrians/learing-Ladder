
public class Start {

    public static void main(String[] args) {
        Person person = new Person();
        person.giveName("Hans");
        System.out.println(person.getFirstName());

        person.giveLastName("Ebai");
        System.out.println(person.getLastName());

        MaxNumber();
    }

    public static void MaxNumber() {
        int[] array = {1, 13, 4, 5};

        int max = 5;
        if (1 > max) {
            max = 1;
        } else if (13 > max) {
            max = 13;
        } else if (4 > max) {
            max = 4;
        } else if (5 > max) {
            max = 5;
        }
        System.out.println(max);
    }


}