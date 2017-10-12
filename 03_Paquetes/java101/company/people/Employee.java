package java101.company.people;

import java101.company.product.Product;
public class Employee {

  public String name;
  public int entryTime;
  public int departureTime;

  public Employee(String name, int entryTime, int departureTime) {
    this.name = name;
    this.entryTime = entryTime;
    this.departureTime = departureTime;
    System.out.println("Creado Empleado "+name+" que trabaja de "+entryTime+" hasta las "+departureTime+".");
  }

  public void printWorkTable() {
      System.out.println("Empleado "+name+" trabaja de "+entryTime+" hasta las "+departureTime+".");
  }

  public Product produce(String name, int size, String color) {
    return new Product(name, size, color);
  }
}
