public class ArrayTest {


    public static void main(String[] args) {
        int[] listOfNumbers = new int[10];//10
//        listOfNumbers[0] = 10;
//        listOfNumbers[0] = 23;
        int[] listOfSecondNumbers = {1, 22, 84, 85, 63, 5};// 6
//         listOfNumbers[0] = 2;

        for (int i = 0; i < listOfSecondNumbers.length; i++) { // when i = 0, i+1 = 1 ;
            listOfNumbers[i] = listOfSecondNumbers[i];
            System.out.print(" " + listOfNumbers[i]);
//            listOfNumbers[i]= i;
//            System.out.println(" "+listOfNumbers[i]); // new line
        }


    }

}
