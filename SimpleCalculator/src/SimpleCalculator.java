public class SimpleCalculator {

    public  int UserOperator(int num1, String operator,int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            default:
                System.out.println("Invalid operator.");
        }

        return 0;

    }
}
