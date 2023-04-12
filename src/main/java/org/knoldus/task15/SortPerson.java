package org.knoldus.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static class PersonAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return Integer.compare(person1.getAge(), person2.getAge());
        }

    }
}

    public class SortPerson {
        public static void main(String[] args) {
            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Jitin", 24));
            persons.add(new Person("Salil", 25));
            persons.add(new Person("Anshika", 22));
            persons.add(new Person("Riya", 21));

            Collections.sort(persons, new Person.PersonAgeComparator());

            for (Person person : persons) {
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
    }

