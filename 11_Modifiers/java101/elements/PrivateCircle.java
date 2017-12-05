package java101.elements;

public class PrivateCircle {

	private int diameter;

  Circle(int diameter) {
    this.diameter = diameter;
  }

  public void printCircle() {
    System.out.println("My diameter is " + diameter);
  }

	protected void grow() {
		this.diameter = this.diameter + 1;
	}

	public void setDiameter(int value) {
		this.diameter = value;
	}
}
