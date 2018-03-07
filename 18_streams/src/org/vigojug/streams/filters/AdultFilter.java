package org.vigojug.streams.filters;

import java.util.function.Predicate;

import org.vigojug.streams.model.Person;

public class AdultFilter implements Predicate<Person> {

    @Override public boolean test(final Person person) {
        return person.getAge() > 17;
    }
}
