package java101.elements;

public class Circle {

	private int diameter;

  Circle(int diameter) {
    this.diameter = diameter;
  }

	Circle() {
		this(10);
	}

	public void setDiameter(int value) {
		this.diameter = value;
	}

	public int getDiameter() {
		return this.diameter;
	}

  void printCircle() {
    System.out.println("I am a circle with a diameter of " + diameter);
  }

	void creceCirculo(Circle c) {
		c.diameter = c.diameter + 1;
		c = new Circle(2);
	}

	Integer creceRadio(Integer r) {
		return r + 1;
	}

	public static void main(String[] args) {

		Circle circulo1 = new Circle(5);

		circulo1.creceCirculo(circulo1);


		System.out.println(circulo1.diameter);

    System.out.println("----------");

    Integer radio = new Integer(2);
    radio = circulo1.creceRadio(radio);
    System.out.println(radio);

  }
}
