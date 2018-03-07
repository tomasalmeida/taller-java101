package org.vigojug.streams.filters;

import java.util.function.Predicate;

import org.vigojug.streams.model.Person;

public class FriendFilter implements Predicate<Person> {
    private final String friendName;

    public FriendFilter(final String friendName) {
        this.friendName = friendName;
    }

    public boolean test(final Person p) {
        return p.getName().equals(friendName);
    }
}
