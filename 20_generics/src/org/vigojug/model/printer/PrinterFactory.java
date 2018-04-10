package org.vigojug.model.printer;

public class PrinterFactory {

    public static <U> Printer<U> createPrinter(U u) {
        return new GenericPrinter<U>();
    }

    public static <T> void isGenericPrinter(T t) {
        System.out.println("hola");
    }
}
