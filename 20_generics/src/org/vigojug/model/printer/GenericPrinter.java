package org.vigojug.model.printer;

public class GenericPrinter<T> implements Printer<T> {

    private T varInstancia;

    public void print(final T t) {
        if (t != null) {
            System.out.println(t.toString());
        } else {
            System.out.println("t is null");
        }
    }
}
