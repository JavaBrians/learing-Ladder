public class FactorialDebugExample {


    public  int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {

            result = result * i;
        }
        return result;
    }

}
