package org.vigojug.streams.filters;

import java.util.function.Predicate;

import org.vigojug.streams.model.Gender;
import org.vigojug.streams.model.Person;

public class ManFilter implements Predicate<Person> {
    public boolean test(final Person p) {
        return p.getGender().equals(Gender.M);
    }
}
