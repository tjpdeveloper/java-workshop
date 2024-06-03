package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Rajini", 25));
        people.add(new Person("Aisha", 30));
        people.add(new Person("Prakash", 20));

        Collections.sort(people, new PersonComparator());


        System.out.println("Sorted List: " + people);
    }
}
