package org.vigojug.exceptions;

import static java.lang.System.out;

import java.io.IOException;

public class Failer {

    public static void thisMethodFails(int a) throws MiPropiaException, NullPointerException {
        out.println("B");
        if (a > 0) {
            throw new MiPropiaException("hola");
        }
        out.println("C");
    }

    public static void otherMethod() {
        try {
            thisMethodFails(5);
        } catch (MiPropiaException t) {
            t.printStackTrace();
        }  finally {
            out.println("P");
        }
    }

    public static void main(String[] args) {
        out.println("A");
        otherMethod();
        out.println("D");
    }
}
