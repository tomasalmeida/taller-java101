package java101.elements;

import java101.elements.Circle;

public class Launcher {
  public static void main(String[] args) {

    java101.elements.Circle circulo1 = new Circle(5);
    Circle circulo2 = circulo1;
    Circle circulo3 = new Circle(5);
    circulo2.grow();

    System.out.println(circulo1.diameter);
    System.out.println(circulo2.diameter);
    System.out.println(circulo3.diameter);

  }
}
