package org.vigojug.exceptions;

public class MiPropiaException extends Exception {

    private final String name;

    public MiPropiaException(String name) {
        super();
        this.name =name;
    }
}
