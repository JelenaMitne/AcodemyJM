package practise.classroom;

import javax.xml.namespace.QName;

public class MethodOverloading {
    public static void main(String[] args) {
        printInformation("Jelena");
        printInformation("Alex", 25);
        printInformation("Michael",40 );
    }

    public static void printInformation(String name) {
        System.out.println("Your name is:" + name);

    }

    public static void printInformation(String name, int age){
        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
    }
}
