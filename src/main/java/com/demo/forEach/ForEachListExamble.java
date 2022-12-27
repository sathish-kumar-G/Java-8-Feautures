package com.demo.forEach;

import java.util.ArrayList;
import java.util.List;

//Person Entity
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ForEachListExamble {
    public static void main(String[] args) {
        //Create Person List
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("sathish",25));
        persons.add(new Person("kumar",22));
        persons.add(new Person("manoj",23));
        persons.add(new Person("akash",26));

        //Normal For Each
        for(Person person : persons){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
        //Using Lambda
        persons.forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });
        //Using Stream
        persons.stream().forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });
    }
}
