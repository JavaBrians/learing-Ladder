import java.util.Scanner;


public class Start {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        SimpleCalculator calculator= new SimpleCalculator();


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

        //int sum;
        System.out.println("enter the first number you want to add");
        int number1 = Integer.parseInt(keyboard.nextLine()); // 4
        System.out.println("choose operator you want to use example -, +, /");
        String operator = keyboard.nextLine();

        System.out.println("Enter the second number:");
        int number2 = Integer.parseInt(keyboard.nextLine());


        int result = calculator.UserOperator(number1, operator,number2);

        //int result = UserOperator(number1, number2, operator);

        System.out.printf("%d %s %d = %d\n", number1, operator, number2, result);




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

//    public static int UserOperator(int num1, int num2, String operator) {
//        switch (operator) {
//            case "+":
//                return num1 + num2;
//            case "-":
//                return num1 - num2;
//            case "*":
//                return num1 * num2;
//            case "/":
//            default:
//                System.out.println("Invalid operator.");
//        }
//
//        return 0;
//
//    }
}



