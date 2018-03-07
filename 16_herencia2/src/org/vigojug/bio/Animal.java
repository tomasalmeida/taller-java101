package org.vigojug.bio;

public abstract class Animal {

    private int age;

    private String name;

    public Animal(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return setUpper(name);
    }

    private String setUpper(final String name) {
        return name.toUpperCase();
    }

    public void setName(final String name) {
        this.name = name;
    }

    public abstract void reproduce();

    public abstract void eat();
}
