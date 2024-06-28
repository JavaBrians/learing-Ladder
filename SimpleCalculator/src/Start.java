
public class Start {

    public static void main(String[] args) {
//        Person person = new Person();
//        person.giveName("Hans");
//        System.out.println(person.getFirstName());
//
//        person.giveLastName("Ebai");
//        System.out.println(person.getLastName());
//        MoreSyntaxErrorExample moreSyntaxErrorExample = new MoreSyntaxErrorExample();
//        moreSyntaxErrorExample.run();
//      int number =  MoreSyntaxErrorExample.number;

        int number = 6;
        FactorialDebugExample factorial = new FactorialDebugExample();
        int fac = factorial.calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + fac);


    }


}