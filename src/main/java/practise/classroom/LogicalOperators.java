package practise.classroom;

public class LogicalOperators<isEmployee, sout> {
    public static void main(String[] args) {
        // Conditional statement
        // operator: if
        // switch

        boolean isStudent = true;

        if (isStudent) {
            System.out.println("He can ask for ISIC card");

        }

        if (5 > 4) {
            System.out.println("Yes, 5 > 4");
        }

        if (!isStudent) ;
        System.out.println("He is not student!");
        //inline expression
        if (1 > 0) {
            System.out.println("Yes 1 > 0");
        }
        // Boolean variables expression

        boolean isEmployee = true;

        if (isEmployee) {
            System.out.println("Yes, this is {Company} employee");
        }

        boolean isGirl = true;
        {
            if (isGirl) {
                System.out.println("Yes, she is a girl");
            }
            //Inline expression
            if (1 > 0) {
                System.out.println("Yes, 1 > 0");

                // Boolean variables' expression (If we use if and after that else, in this case the meaning may be different.
                //we put false - in this case the program shows the meaning after "else". Opposite to if
                boolean isDark = false;

                if (isDark) {
                    System.out.println("Yes, it is dark colour");
                } else {
                    System.out.println("No, it is not dark colour!");
                }

                boolean isCheap = false;
                if (isCheap) {

                    System.out.println("Yes it is cheap price!");
                } else {
                    System.out.println("No, it is expensive!");

                    boolean isFast = false;
                    if (isFast) {
                        System.out.println("Yes, this car is fast");
                    } else {
                        System.out.println("No, this car is too slow! ");

                        if (1 < 0) {
                            System.out.println("Yes 1 > 0");
                        } else {
                            System.out.println("1 < 0");
                        }

                        int x = 10;
                        int y = 20;
                        if (x > y) {
                            System.out.println("x = 10 and y = 20, 10 greater then 20");
                        } else {
                            System.out.println("10 is less then 20");
                        }

                        //logical operators OR AND
                        //|| - OR
                        //&& - AND

                        int speedMercedes = 40;
                        int speedBMW = 50;
                        int speedPorche = 200;
                        int speedMcLaren = 200;


                        if(speedBMW > speedMercedes && speedBMW > speedPorche) {
                            System.out.println("Yes, BMW speed is greater than mercedes speed and greater than Porche");
                        } else {
                            System.out.println("Something went wrong");
                        }

                    }
                }
            }


        }

    }











        /*
        if(condition) {
        //code
        }
         */

}
