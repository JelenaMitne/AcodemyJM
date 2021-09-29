package practise.homework;

public class Egle {
    public static void main(String[] args) {


//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();

      int height = 7;
      for (int i = 1; i<=height; i++) {
          for (int space=1; space<=height-i; space++) {
              System.out.print(" ");
          }
          for (int star=1; star<=i*2-1; star++) {
              System.out.print("*");
          }
          System.out.println();

          }

        }
    }

