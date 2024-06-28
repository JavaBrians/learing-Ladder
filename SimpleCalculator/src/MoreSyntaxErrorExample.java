public class MoreSyntaxErrorExample {

    public void run(){
        System.out.println("Starting the program);

        int[] numbers = {1, 2, 3, 4, 5};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i])
        }

        String message = "Learning Java is fun!;
        char initial = 'J;
        System.out.println(message);
        System.out.println("Initial: " + initial);

        int sum = 0;
        for(int number : numbers) {
            sum += number
        }
        System.out.println("Sum of numbers: " + sum);

        System.out.println("Program completed successfully.";
    }
}
