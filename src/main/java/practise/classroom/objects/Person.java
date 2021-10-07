package practise.classroom.objects;

import lombok.*;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Slf4j
public class Person {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private boolean isHetero;
    public void retrieveInformation() {
        log.info("Name is: {}\n Surname is: {}\n Age is: {} Weight is: {} \n Is hetero: {}",
                name, surname, age, weight, isHetero);
    }

//        System.out.printf("Name is: %s\n Surname is: %s\n Age is: %d Weight is: %s \n Is hetero: %s",
//                name, surname, age, weight, isHetero);
//    }

//    public Person() {
//    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
    @Override
    public String toString() {
        return "Name:" + this.name;


//    public Person(String name, String surname, int age, double weight, boolean isHetero) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.weight = weight;
//        this.isHetero = isHetero;


//    }
//    public void setName(String name){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public boolean isHetero() {
//        return isHetero;
//    }
//
//    public void setHetero(boolean hetero) {
//        isHetero = hetero;
    }
}
