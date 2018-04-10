package org.vigojug.model.printer;

public class StringPrinter implements Printer<String> {

    public void print(final String s) {
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("S is null");
        }
    }
}
