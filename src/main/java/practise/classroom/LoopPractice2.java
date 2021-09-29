package practise.classroom;

public class LoopPractice2 {
    public static void main(String[] args) {


        /*
        for(statement1; statement2; statement3) {
        // code block to be executed
        }

        statement 1 - is executed (one time) of the code block
        //Initialize counter variable: (int i = 0);

        statement 2 - define condition for executing the code block
        //Boolean Condition
        //Element list = 10;
        //i <10;

        //statement 3 - is executed (every time)
        //Increment/Decrement counter variable


       */

        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello World");

        }

        //i = 0;
        //i < 10 (TRUE)
        // CODE IS EXECUTED

        //i = 1;
        //i <10;
        //CODE IS EXECUTED

        //i = 2 ;
        //2 < 10 (TRUE)
        // CODE IS EXECUTED

        //i = 3 ;
        //3 < 10 (TRUE)
        // CODE IS EXECUTED

        //...

        //i = 10 ;
        //10 < 10 (FALSE)
        // STOP LOOP

        String[] names = {"Nikita", "Andrew", "Max", "Anthony"};
        for (int i = 2; i < names.length; i++) {
            System.out.println(names[i]);
        }

//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 3) {
//                System.out.println(numbers[i]);
//            } else {
//                System.out.println("Number is less then 4:" + numbers[i]);
//            }
//            for (int i = 0; i < names.length; i++) {
//                if (names[i].equals("Andrew")) {
//                    System.out.println("I found Andrew!");

//                }
        String[] animalNames = {"tiger", "zebra", "dog", "giraffe", "crocodile", "donkey", "monkey", "hamster", "antelope", "bison"};
        for (int i = 0; i < animalNames.length; i++) {
            if (animalNames[i].equals("crocodile")) {
                System.out.println("Crocodile is found!");
            }
        }
    }
}






