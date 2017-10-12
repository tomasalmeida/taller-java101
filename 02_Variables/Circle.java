public class Circle {

	public int diameter;

  Circle(int diameter) {
    this.diameter = diameter;
  }

	Circle() {
		this(10);
	}

  void printCircle() {
    System.out.println("I am a circle with a diameter of " + diameter);
  }

	void creceCirculo() {
		this.diameter = this.diameter + 1;
	}

	static void creceCirculo(Circle c) {
		c.diameter = c.diameter + 1;
	}

	void creceRadio(int r) {
		r = r + 1;
	}

	public static void main(String[] args) {

		Circle circulo1 = new Circle(5);
		Circle circulo2 = circulo1;
		Circle circulo3 = new Circle(5);
		circulo2.creceCirculo();

		System.out.println(circulo1.diameter);
		System.out.println(circulo2.diameter);
		System.out.println(circulo3.diameter);

		System.out.println("----------");

		int radio1 = 5;
		int radio2 = radio1;
		int radio3 = 5;
		radio2 = radio2 + 1;
		System.out.println(radio1);
		System.out.println(radio2);
		System.out.println(radio3);

		System.out.println("----------");

		Circle circulo4 = new Circle(5);
		Circle circulo5 = circulo4;
		Circle circulo6 = new Circle(5);
		Circle.creceCirculo(circulo5);

		System.out.println(circulo4.diameter);
		System.out.println(circulo5.diameter);
		System.out.println(circulo6.diameter);

		System.out.println("----------");

  }
}
