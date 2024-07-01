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

        // todo: test the code and see how it works
        // todo: to start coding it nice to have a plan
        // todo: improve this program do not build a new program
        //todo: understand the code and make a plan of action and work according to your plan

        int sum;
        System.out.println("enter the first number you want to add");
        int number1 = Integer.parseInt(keyboard.nextLine()); // 4
        System.out.println("choose operator you want to use example -, +, /");
        String userOperatorChoose = keyboard.nextLine();
        System.out.println("enter the number you want to add");
        int number2 = keyboard.nextInt();

        switch (userOperatorChoose) {
            case "+":
                sum = number1 + number2;
                System.out.printf("%d + %d = %d", number1, number2, sum);
            default:
                System.out.printf("Invalid operator");

        }


//        SimpleCalculator calculator = new SimpleCalculator();
//        while (true) { // why did you use while(true)?
//            System.out.println("enter the first number");
//            String input = String.valueOf(Integer.parseInt(keyboard.next())); // better use Integer.parseInt(keyboard.nextLine())
//            System.out.println("choose operator you want to use example -, +, /");
//            String userOperatorChoose = keyboard.next();
//            if (calculator.UserOperator(calculator.UserOperator()!= userOperatorChoose)) {
//                System.out.println("chose a valid operator");
//            }else {
//
//            }
//            System.out.println("enter the second number");
//            String input2 = String.valueOf(Integer.parseInt(keyboard.next()));
//            }
//            }


    }

}



