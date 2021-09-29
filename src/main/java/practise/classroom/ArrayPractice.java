package practise.classroom;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {
    public static void main(String[] args) {

        // data type
        // [] massive starts from 0
        // name

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        //[0] = 1
        //[1] = 2
        //[2] = 3
        //...


        int firstNumber = numbers[6];
        System.out.println(firstNumber);

        int[] arrayOfNumbers = new int[3];
        arrayOfNumbers[0] = 3;
        arrayOfNumbers[1] = 8;
        arrayOfNumbers[2] = 6;

        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] names = {"Nikita" , "John" , "Olga", "Svetlana"};
        String[] emptyArray = new String[4];

        emptyArray [0] = "Nikolay";
        emptyArray [1] = "Olga";
        emptyArray [2] = "John";
        System.out.println(Arrays.toString(emptyArray));

       // boolean[]booleanArray = {true, false, booleanArray isAutumn = booleanArray[0];









    }
}
