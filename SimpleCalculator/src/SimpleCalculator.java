public class SimpleCalculator {





    public int addition(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a + b;
    }
    public int multiplication(int a, int b){
        return a * b;
    }
    public int division(int a, int b){
        return a / b;
    }
  public String UserOperator(char operator){
        switch(operator){
            case '+':
                return "+";
            case '-':
                return "-";
            case '*':
                return "*";
            case '/':
                return "/";
            default:
                return "Invalid operator";
        }

    }
}
