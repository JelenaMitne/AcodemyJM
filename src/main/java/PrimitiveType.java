public class PrimitiveType {
    public static void main(String[] args) {

//Double primitive type practice

       double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 1337.13;
        System.out.println(doubleValue);


//Float primitive type practice
        float floatMinValue = Float .MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float .MAX_VALUE;
        System.out.println(floatMaxValue);

        float floatValue = 1000.1f;

//Long primitive type practice
        

//Int primitive type practice
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int firstVariable = 200;
        int secondVariable = 400;
        System.out.println(Integer.max(firstVariable,secondVariable));
        Integer.compare(firstVariable,secondVariable);
 //String
 String myName = "Jelena";
 String myLastname = "Mitne";
        System.out.println(myName + "" +myLastname);
        System.out.printf("%s %s\n", myName, myLastname);
        String nameAndUserName = String.format("%s %s\n", myName, myLastname);
        System.out.println(nameAndUserName);

//Boolean
        boolean isStudent = false;
//Method call
        printHelloWorld();


    }
//Method declaration
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
    }

}
