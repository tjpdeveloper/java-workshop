package main.java;

class Person {
    private String name;
    private int age;

    //This constructor is mandatory for custom sorting to work
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   // Note: getter methods are required if used in the comparator.
       public String getName() {
        return name;
    }
    // Ex: In this example, we sort by age hence getAge() is required.
    public int getAge() {
        return age;
    }

    //This is required to see the sorting in readable format rather than object name
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}
