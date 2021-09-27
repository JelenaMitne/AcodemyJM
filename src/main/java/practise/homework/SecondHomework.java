package practise.homework;

public class SecondHomework {
    public static void main(String[] args) {

//  1 Если переменная типа int = 10, выведите на экран: “Integer value is 10”
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int firstNumber = numbers[9];
        System.out.println(firstNumber);

        int[] numbersDefinition = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i1 = 0; i1 < numbersDefinition.length; i1++) {
            if (numbers[i1] != 10) {
                continue;
            }
            System.out.println("Integer value is 10");
        }
        // 3 Создать массив String и добавить в него 10 наименований животных. Пройтись циклом по массиву, найти и распечатать любого животного.
        // A list of animals. The goal : to print out the exact animal. For example "Crocodile"
        String[] animalNames = {"tiger", "zebra", "dog", "giraffe", "crocodile", "donkey", "monkey", "hamster", "antelope", "bison"};
        for (int i = 0; i < animalNames.length; i++) {
            if (animalNames[i].equals("crocodile")) {
                System.out.println("Crocodile is found!");
            }
        }
//      4 Создать массив с числами от 0 до 10 и распечатать только (те) четные числа.
//      Print out "Odd Numbers"

            for (int z = 1; z <= 10; z = z + 2) {
                System.out.println(z);
            }

//            //Print out "Even numbers"
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int a = 0; a < array.length; a++) {
                if (array[a] % 2 == 0) {
                    System.out.println(array[a]);
                }
            }

//        6 Распечатать на экране числа от 1 до 100.
        for (int k = 1; k <= 100; k++) {
            System.out.println((k + " "));
        }
//        7 Распечатать на экране числа от 50 до 1.
//        reverse counting 50 to 0
        for (int k1 = 50; k1 >= 0; k1--) {
            System.out.println(k1 + " ");
        }

//        8 Распечатайте на экране таблицу умножения.
        int a1 = 1;
        int b = 1;
        while (a1 <= 10) {
            System.out.print(a1 + " ");
            while (b <= 9) {
                b++;
                System.out.print(a1 * b + " ");
            }
            a1++;
            b = 1;
            System.out.println("");
        }

        for (int k = 1; k <= 10; k++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(j + "x" + k + "=" + (j * k) + "\t");

            }
            System.out.println("\n");
        }




    }
    }

