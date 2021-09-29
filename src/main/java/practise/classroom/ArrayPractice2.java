package practise.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice2 {
    public static void main(String[] args) {

        // data type
        //[]
        //name

        int[] numbers = {1,2,3,4,5,6,7};
        int firstNumber = numbers[6];

        //[0] =1
        //[1] = 2
        //[2] = 3
        //...
        System.out.println(firstNumber);

//        int[] arrayOfNumbers = new int[3];
//        //1,2,3
//
//        arrayOfNumbers[0] = 3;
//        arrayOfNumbers[1] = 5;
//        arrayOfNumbers[2] = 6;
//        System.out.println(Arrays.toString(arrayOfNumbers));

        int[] arrayOfNumbers = new int[5];
        arrayOfNumbers[0] = 2;
        arrayOfNumbers[1] = 4;
        arrayOfNumbers[2] = 6;
        arrayOfNumbers[3] = 8;
        arrayOfNumbers[4] = 10;
        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] names = {"Nikita", "John", "Andrew", "Marcus"};
        System.out.println(names[1]);
        String[] emptyArray = new String[4];
        emptyArray[0] = "Nikolay";
        emptyArray[1] = "Max";
        emptyArray[2] = "Janis";
        emptyArray[3] = "Armand";
//        emptyArray[4] = "Max";
        System.out.println(Arrays.toString(emptyArray));

        boolean[] booleanArray = {true,false,false,true};
        boolean isAutumn = booleanArray[0];
        boolean isHotOutside = booleanArray[1];
        System.out.printf("Outside is quite hot: %s", isHotOutside);
        System.out.printf("Outside is Autumn: %s", isAutumn);




    }

}
