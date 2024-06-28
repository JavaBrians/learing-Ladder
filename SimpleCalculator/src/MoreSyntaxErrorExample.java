public class MoreSyntaxErrorExample {
    public static int number = 10;

    public void run() {
//        System.out.println("Starting the program....");
//
        int[] numbers = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Number: " + numbers[i]);//i = 0,i = 1 ,i = 2, i = 4;
//        }

//        String message = "Learning Java is fun!";
//        char[] initial = {'L','M','V'};
//
//
//        System.out.println(message);
//        System.out.println("Initial: " + initial);


        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }
        System.out.println("Sum of numbers: " + sum);

        System.out.println("Program completed successfully.");
    }


}
