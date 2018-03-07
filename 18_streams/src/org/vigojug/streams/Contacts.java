package org.vigojug.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.vigojug.streams.model.Gender;
import org.vigojug.streams.model.Person;

public class Contacts {

    List<Person> contacts = new ArrayList<>();

    public List<Person> getMaleContactsWhoCanDrink() {
        // JAVA 7
        //        List<Person> maleContacts = new ArrayList<>();
        //        for (Person contact : contacts) {
        //            if (contact.getGender().equals(Gender.M) && contact.getAge() > 17) {
        //                maleContacts.add(contact);
        //            }
        //        }
        //        return maleContacts;

        // JAVA 8 - 5 + 12 + 12
        //        return contacts
        //                .stream()
        //                .filter(new ManFilter())
        //                .filter(new AdultFilter())
        //                .collect(Collectors.toList());

        return contacts.stream()
                .filter(p -> p.getGender().equals(Gender.M))
                .filter(p -> p.getAge() > 17)
                .collect(Collectors.toList());

    }

    public boolean isMyFriend(String friendName) {
        //        return contacts
        //                .stream()
        //                .anyMatch(new FriendFilter(friendName));

        return contacts.stream()
                .anyMatch(p -> p.getName().equals(friendName));
    }

    public void sayHelloOrdered() {
        //        contacts.stream()
        //                .map(PersonToNameMapper::map)
        //                .forEach(new SayHelloConsumer());

        contacts.stream()
                .map(Person::getName)
                .sorted()
                .forEach(name -> System.out.println("Hello" + name));
    }

    public void addContact(Person p) {
        contacts.add(p);
    }

    public Runnable getRunnable() {
        return () -> System.out.println("hola");
    }

    public static void main(String[] args) {
        Person tomas = new Person("Tomas", 33, Gender.M);
        Person maria = new Person("Maria", 25, Gender.F);
        Person alberto = new Person("Alberto", 15, Gender.M);
        Person cris = new Person("Cris", 12, Gender.F);

        Contacts contacts = new Contacts();
        contacts.addContact(tomas);
        contacts.addContact(maria);
        contacts.addContact(alberto);
        contacts.addContact(cris);
    }
}
