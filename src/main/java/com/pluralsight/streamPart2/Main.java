package com.pluralsight.streamPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
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

        List<Person> searchName = people.stream()
                .filter(person -> person.getFirstName().equals(name) || person.getLastName().equals(name))
                .toList();
        searchName.forEach(System.out::println);


        double averageAge = people.stream()
                .mapToInt(Person :: getAge).average()
                .orElse(0);

        int oldestAge = people.stream()
                .mapToInt(Person :: getAge).min()
                .orElse(0);

        int youngestAge = people.stream()
                .mapToInt(Person :: getAge).max()
                .orElse(0);


        System.out.println("\nAverage Age: " + averageAge);
        System.out.println("Oldest Age: " + oldestAge);
        System.out.println("Youngest Age: " + youngestAge);
    }
}
