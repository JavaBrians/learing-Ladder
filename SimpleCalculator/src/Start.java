import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        Person person = new Person();
//        person.giveName("Hans");
//        System.out.println(person.getFirstName());
//
//        person.giveLastName("Ebai");
//        System.out.println(person.getLastName());
//        MoreSyntaxErrorExample moreSyntaxErrorExample = new MoreSyntaxErrorExample();
//        moreSyntaxErrorExample.run();
//      int number =  MoreSyntaxErrorExample.number;

//        int number = 6;
//        FactorialDebugExample factorial = new FactorialDebugExample();
//        int fac = factorial.calculateFactorial(number);
//        System.out.println("The factorial of " + number + " is: " + fac);
        int sum = 0;
        System.out.println("enter the first number you want to add");
        int number1 = Integer.parseInt(keyboard.nextLine()); // 4
        System.out.println("choose operator you want to use example -, +, /");
        String userOperatorChoose = keyboard.nextLine();

        switch (userOperatorChoose){
            case "+":
                System.out.println("enter the number you want to add");
                int number2 = keyboard.nextInt();
                sum = number1 + number2;
                System.out.printf("%d + %d = %d",number1,number2,sum);
        }


    }




}