package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



//Olivia Martinez – 28
//Ethan Johnson – 34
//Sophia Nguyen – 22
//Liam Anderson – 41
//Ava Patel – 29
//Noah Thompson – 37
//Isabella Garcia – 25
//Mason Lee – 31
//Mia Robinson – 45
//Lucas Wright – 27

public class Main {}
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person>people = new ArrayList<>();
        people.add(new Person("Olivia", "Martinez", 28));
        people.add(new Person("Ethan", "Johnson", 34));
        people.add(new Person("Sophia", "Nguyen", 22));
        people.add(new Person("Liam", "Anderson", 41));
        people.add(new Person("Ava", "Patel", 29));
        people.add(new Person("Noah", "Thompson", 37));
        people.add(new Person("Isabella", "Garcia", 25));
        people.add(new Person("Mason", "Lee", 31));
        people.add(new Person("Mia", "Robinson", 45));
        people.add(new Person("Lucas", "Wright", 27));

        System.out.print("Enter The First Name Or Last Name: ");
        String name = scanner.nextLine().trim();

        List<Person> searchName = new ArrayList<>();


        for (Person person : people) {
            if (person.getFirstName().equals(name) || person.getLastName().equals(name)) {
                searchName.add(person);
                System.out.println(person);
            }
        }

        int oldestAge = people.get(0).getAge();
        int youngestAge = people.get(0).getAge();
        double totalAge = people.get(0).getAge();

        for (Person p : people) {
            totalAge += p.getAge();
            int age = p.getAge();
            if(age > oldestAge) oldestAge = age;
            if (age < youngestAge) youngestAge = age;
        }

        double averageAge = totalAge /  people.size();

        System.out.println("\nOldest Age: " + oldestAge);
        System.out.println("Youngest Age: " + youngestAge);
        System.out.println("Average Age: " + averageAge);

    }
}
*/