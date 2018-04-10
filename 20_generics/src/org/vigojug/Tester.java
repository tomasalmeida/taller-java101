package org.vigojug;

import org.vigojug.model.Animal;
import org.vigojug.model.Cage;
import org.vigojug.model.Person;
import org.vigojug.model.Rhino;
import org.vigojug.model.printer.GenericPrinter;
import org.vigojug.model.printer.OldPrinter;
import org.vigojug.model.printer.Printer;
import org.vigojug.model.printer.PrinterFactory;
import org.vigojug.model.printer.StringPrinter;

public class Tester {

    public static void main(String[] args) {

//                Cage<String> cageString = new Cage<>();
//                Cage<Person> cagePerson = new Cage<>();
        //        cagePerson.setElement(new Person("tomas"));
        //        System.out.println(cagePerson.getElement().getName());

//        Printer<String> printer1 = new StringPrinter();
//        printer1.print("hola mundo");
//        printer1.print(null);
//        //printer1.print(new Integer(1));
//
//        Printer<Integer> printer2 = new GenericPrinter<>();
//        //printer2.print("hola mundo");
//        printer2.print(null);
//        printer2.print(new Integer(1));
//
//        printer1 = new GenericPrinter<>();
//        printer1.print("hola mundo");
//        printer1.print(null);
//        //printer1.print(new Integer(1));
//
//        Printer<Person> printer3 = new OldPrinter();
//        //printer3.print("hola Mundo");
//        //printer3.print(new Integer(1));
//        printer3.print(null);
//
//        Printer printer4 = new OldPrinter();
//        printer4.print("hola Mundo");
//        printer4.print(new Integer(1));
//        printer4.print(null);
//
//        Printer<String> printer6 = PrinterFactory.createPrinter("texto");
//        Printer<Person> printer7 = PrinterFactory.createPrinter(new Person("tomas"));


        Cage<Rhino> cageRhino = new Cage<>();


        GenericPrinter<? super Rhino> rhinoPrinter = new GenericPrinter<Rhino>();

    }
}
