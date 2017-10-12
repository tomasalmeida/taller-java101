package java101.elements;

public class Circle {

	public int diameter;

  public Circle(int diameter) {
    this.diameter = diameter;
  }

  public void printCircle() {
    System.out.println("My diameter is " + diameter);
  }

	public void grow() {
		this.diameter = this.diameter + 1;
	}
}
