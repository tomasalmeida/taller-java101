package java101.company.product;

public class Product {

  public String name;
  public int size;
  public String color;

  public Product(String name, int size, String color) {
    this.name = name;
    this.size = size;
    this.color = color;
    System.out.println("Creado producto ("+name+", "+size+", "+color+").");
  }
}
