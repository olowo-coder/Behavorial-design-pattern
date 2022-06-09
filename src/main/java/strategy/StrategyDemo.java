package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo {
    public static void main(String[] args) {
//        sortingStrategy();

        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2022");
        amexCard.setCvv("123");

        System.out.println("Is amex Valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2019");
        amexCard2.setCvv("234");

        System.out.println("Is amex2 Valid: " + amexCard2.isValid());

        CreditCard visa = new CreditCard(new VisaStrategy());

        visa.setNumber("4539589763663402");
        visa.setDate("09/22");
        visa.setCvv("453");

        System.out.println("Is visa card valid: " + visa.isValid());


    }

    static void sortingStrategy(){

        Person chris = new Person("Chris", 34, "555-456-345");

        Person bryan = new Person("Bryan", 54, "455-456-345");

        Person ben = new Person("Ben", 31, "675-456-345");

        List<Person> people = new ArrayList<>();

        people.add(chris);
        people.add(bryan);
        people.add(ben);

        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge() > o2.getAge())return 1;
                if(o1.getAge() < o2.getAge())return -1;
                return 0;
            }
        });

        System.out.println(people);

        people.sort(Comparator.comparing(Person::getName));

        System.out.println(people);

    }
}
