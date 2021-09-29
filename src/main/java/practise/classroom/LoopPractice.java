package practise.classroom;

public class LoopPractice {
    public static void main(String[] args) {

        /*

        for(statement1; statement2; statement3) {
        // code block to be executed
        }

        statement 1 - is executed (one time) of the code block
        //Initialize counter variable: (int i = 0);

        statement 2 - define the condition for executing the code block
        //Boolean condition
        //Element list = 10;
        //i , 10;

        //statement 3 - is executed (every time) after the code block has been executed

         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }


//            String[] names = {"Nikita", "Andrew", "Max", "Anthony"};
//            for (int i = 0; i                                                                                                                                                          , names.lenghth; i++) {
//                System.out.println(i);
//            }
        // i = 0;
        // i< 4;
        // System.out.println(names[0]);

        // i = 0;
        // i< 4;
        // System.out.println(names[4]);


//            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.println(numbers[i]);
//            }
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 4) {
//                System.out.println(numbers[i]);
//            } else {
//                System.out.println("Number is less then 4:" + numbers[i]);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 4) {
                System.out.println(numbers[i]);
            } else {
                System.out.println("Other numbers:" + numbers[i]);
            }
        }

//        for (int i = 0; i < names.length; i++) {


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 3) {
                System.out.println(numbers[i]);
            } else {
                System.out.println("Hello: Number is less then 4:" + numbers[i]);
                System.out.println("=========");
            }
        }

                for (int i = numbers.length - 1;  i >= 0 ; --i) {
                    System.out.println(numbers[i]);
                }
            }


        }



