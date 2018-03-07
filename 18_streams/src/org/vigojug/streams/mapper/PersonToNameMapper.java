package org.vigojug.streams.mapper;

import org.vigojug.streams.model.Person;

public class PersonToNameMapper {
    public static String map(final Person person) {
        return person.getName();
    }
}
