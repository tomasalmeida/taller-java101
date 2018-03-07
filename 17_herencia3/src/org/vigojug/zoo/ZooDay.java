package org.vigojug.zoo;

import java.util.ArrayList;
import java.util.List;

import org.vigojug.zoo.animals.Animal;
import org.vigojug.zoo.animals.Elephant;
import org.vigojug.zoo.animals.Monkey;
import org.vigojug.zoo.animals.WhiteWolf;
import org.vigojug.zoo.animals.Wolf;
import org.vigojug.zoo.people.Person;
import org.vigojug.zoo.people.visitors.AdultVisitor;
import org.vigojug.zoo.people.visitors.ChildVisitor;
import org.vigojug.zoo.people.visitors.Visitor;
import org.vigojug.zoo.people.workers.Employee;

public class ZooDay {

    public static void main(String[] args) {

        Employee manolo = new Employee(45);

        Wolf w1 = new Wolf("lobo 2");
        WhiteWolf ww2 = (WhiteWolf) w1;

        List<Animal> zooAnimails = new ArrayList<>();
        zooAnimails.add(new Elephant("ele 1"));
        zooAnimails.add(new Elephant("ele 2"));
        zooAnimails.add(new Wolf("lobo 1"));
        zooAnimails.add(new WhiteWolf("lobo blanco"));
        zooAnimails.add(new Monkey("mono"));
        zooAnimails.add(new Monkey("estereo"));

        for(Animal animal : zooAnimails) {
            System.out.println("Animal '" + animal.getName() + "' es carnivoro? " + animal.isCarnivore());
        }

        List<Person> visitorList = new ArrayList<>();
        visitorList.add(new AdultVisitor(35));
        visitorList.add(new AdultVisitor(60));
        visitorList.add(new AdultVisitor(25));
        visitorList.add(new AdultVisitor(40));
        visitorList.add(new ChildVisitor(10));
        visitorList.add(new ChildVisitor(5));
        visitorList.add(new Employee(45));

        for (Person person : visitorList) {
            if (!person.isPartner()) {
                System.out.println("Cual es tu edad? " + person.getAge());
            }
        }

    }
}
