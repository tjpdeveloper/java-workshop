package main.java;

import java.util.Comparator;

class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        //return o1.getAge() - o2.getAge();
        //return o2.getAge() - o1.getAge();
        //return o1.getName().compareTo(o2.getName());
        return o2.getName().compareTo(o1.getName());

    }


}