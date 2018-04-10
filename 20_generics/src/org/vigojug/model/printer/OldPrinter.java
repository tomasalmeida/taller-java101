package org.vigojug.model.printer;

public class OldPrinter implements Printer {

    public void print(final Object o) {
        if (o != null) {
            System.out.println(o);
        } else {
            System.out.println("O is null");
        }
    }
}
