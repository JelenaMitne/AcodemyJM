package practise.homework;

public class FirstHomework {
    public static void main(String[] args) {
//Double
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double averageTime = 3.5;
        System.out.println(averageTime);

        double daysQuantity = 345;
        double salesQuantity = 1055;
        System.out.println(daysQuantity/salesQuantity);

        double rainyDays= 6.5;
        double daysJuly = 31;
        double sunnyDays = daysJuly-rainyDays;
        System.out.println(sunnyDays);

        double averageTemperatureInSummer = 21.4;
        System.out.println("Average temperature in Riga summertime:" + averageTemperatureInSummer);

        double doubleDistanceLength = 128956.67;
        System.out.println(doubleDistanceLength);

        double minTime = 0.00000005;
        System.out.println(minTime);

        double maxHigh = 1099887665443.678;
        System.out.println(maxHigh);

//Float

       float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMinPrice = (float) 5.780000001;
        System.out.println(floatMinPrice);

        float floatMaxTimeInSeconds = (float) 3.67000000567;
        System.out.println(floatMaxTimeInSeconds);

        float floatAvgLength = (float) 237.9800004;
        System.out.println(floatAvgLength);

        float floatValue = 2000.56700008f;
        System.out.println(floatValue);

        float floatFirstValue = 345.8f;
        float floatSecondValue = 345.1f;
        Float.sum(floatFirstValue,floatSecondValue);
        System.out.println(Float.sum(floatFirstValue,floatSecondValue));


//Integer
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int firstScore = 125;
        int secondScore = 230;
        Integer.max(firstScore,secondScore);
        System.out.println(Integer.max(firstScore, secondScore));

        int mayBudget = 40345;
        int juneBudget = 20567;
        Integer.compare(mayBudget,juneBudget);
        System.out.println(Integer.compare(mayBudget,juneBudget));

        int firstLength = 300;
        int secondLength = 100;
        Integer.sum(firstLength,secondLength);
        System.out.println(Integer.sum(firstLength,secondLength));

        int numberOfA = 13456;
        int numberOfB = 123;
        Integer.divideUnsigned(numberOfA,numberOfB);
        System.out.println(Integer.divideUnsigned(numberOfA,numberOfB));

//Defined the real Quantity Value, as for we stated incorrect (max stated in min definition,but min stated in max definition) .
        int maxQuantity = 60;
        int minQuantity = 234;
        Integer.min(maxQuantity,minQuantity);
        System.out.println(Integer.min(maxQuantity,minQuantity));

//String
        String myName = "Jelena";
        System.out.println(myName);

        String lastName = "Mitne";
        System.out.println(lastName);

        String myNameAndLastName = myName + lastName;
        System.out.println(myNameAndLastName);
        System.out.printf("%s %s\n", myName,lastName);

        String nameAndLastName = String.format("%s %s\n", myName, lastName);
        System.out.println(nameAndLastName);

        String name = "Jelena";
        String surname = "Mitne";
        String dateOfBirth = "11/07/1985";
        System.out.println(" My name is: " + name + " My surname is: " + surname + " I was born in: " + dateOfBirth);

        String firstName = "Jelena";
        String secondName = "Mitne";
        String dayOfBirth = "11/07/1985";
        int yearsOld = 36;

        System.out.printf("My name is %s. My surname is %s. I was born in %s. I am %d years old.\n", firstName, secondName, dayOfBirth, yearsOld);
 //Byte

        byte getByte = 54;
        byte getNewByte = 127;
        System.out.println("The whole capability now is : " + getByte);
        System.out.println("The largest capability is : " + getNewByte);

//Boolean
        boolean isMale = true;
        System.out.println(isMale);

        boolean isNegativeValue = false;
        System.out.println(isNegativeValue);
        
        boolean isPassedRegistration = false;
        System.out.println(isPassedRegistration);

        boolean isPassedTheExam = true;
        System.out.println(isPassedTheExam);

        boolean taskIsDone = true;
        boolean taskIsNotDone= false;
        System.out.println("Is this task done? : " + taskIsDone);
        System.out.println("Is this task not done? : " + taskIsNotDone);

//Char
        char theMinLengthOfField = 3;
        char theMaxLenghthOfField = 25;
        Character.compare(theMinLengthOfField,theMaxLenghthOfField);
        System.out.println(Character.compare(
                theMinLengthOfField,theMaxLenghthOfField));
//Convert Character to integer (конвертирует в цифру, согласно установленному списку)
        char nameOfLetter = 'b';
        Character.getNumericValue(nameOfLetter);
        System.out.println(Character.getNumericValue(nameOfLetter));

//Convert from digit to meaning.It`s super!:)
        char theMeanOfValueInLetter = 8;
        Character.getName(theMeanOfValueInLetter);
        System.out.println(Character.getName(theMeanOfValueInLetter));

        char theFirstMeaning = 'v';
        char theSecondMeaning = 'c';
        Character.compare(theFirstMeaning,theSecondMeaning);
        System.out.println(Character.compare(theFirstMeaning,theSecondMeaning));

        char theFirstSymbol = 'h';
        Character.getType(theFirstSymbol);
        System.out.println(Character.getType(theFirstSymbol));

        char theSecondSymbol = 'Z';
        Character.isLowerCase(theSecondSymbol);
        System.out.println(Character.isLowerCase(theSecondSymbol));

        char theThirdSymbol = 'z';
        Character.isLetter(theThirdSymbol);
        System.out.println(Character.isLetter(theThirdSymbol));
//Long
        long theDistanceBetweenTheMoonAndMars =48888889990099999l;
        System.out.println(theDistanceBetweenTheMoonAndMars);

        long theAgeOfPlanet = 300000000000000000l;
        System.out.println(theAgeOfPlanet);

        long theLengthOfField = 40000088676755555l;
        System.out.println(theLengthOfField);

        long theFirstDistance = 6677889000656544300l;
        long theSecondDistance = 778899990000000l;
        Long.divideUnsigned(theFirstDistance,theSecondDistance);
        System.out.println(Long.divideUnsigned(theFirstDistance,theSecondDistance));

        long theFirstWeight = 678899000766l;
        long theSecondWeight = 10000000000l;
        Long.sum(theFirstWeight,theSecondWeight);
        System.out.println(Long.sum(theFirstWeight,theSecondWeight));

//Short

        short theValueOfProfit = -32000;
        System.out.println(theValueOfProfit);

        short theMinTime = 1;
        System.out.println(theMinTime);

        short theDistanceTillMoscow = 921;
        short theDistanceTillWarsaw = 687;
        Short.compare(theDistanceTillMoscow,theDistanceTillWarsaw);
        System.out.println(Short.compare(theDistanceTillMoscow,theDistanceTillWarsaw));

        short theQuantityOfDaysInStatedPeriod = 674;
        System.out.println(theQuantityOfDaysInStatedPeriod);


      printHellolWorld();

    }

   public static void printHellolWorld() {
       System.out.println("HelloWord");
    }

}
