package practise.classroom.objects;

public class Main {
    public static void main(String[] args) {
        Person john = new Person();
        john.setName("John");
        john.setSurname("Doe");
        john.setAge(20);
        john.setWeight(70.6);
        john.setHetero(false);
        john.retrieveInformation();
        System.out.println();

        Person andrey = new Person("Andrey", "Ivanov");
        andrey.setAge(21);
        System.out.printf("Andrey age is: %d\n", andrey.getAge());
        andrey.setWeight(80.3);
        andrey.setHetero(false);
        andrey.retrieveInformation();
        System.out.println();

        Person angelica = new Person("Angelica", "Varum", 52, 70.0, true);
        angelica.retrieveInformation();
        System.out.println(angelica);
    }


    }

