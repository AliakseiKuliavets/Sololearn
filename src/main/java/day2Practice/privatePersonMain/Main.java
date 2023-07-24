package day2Practice.privatePersonMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Aliaksei");
        person1.setAge(22);
        person1.setJob("Developer");

        System.out.println("First person: ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Job: " + person1.getJob());

        Person person2 = new Person();
        person2.setName("Anton");
        person2.setAge(12);
        person2.setJob("Don`t have job");

        System.out.println("\nSecond person:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Job: " + person2.getJob());

    }
}
