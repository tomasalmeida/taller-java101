package java101.elements2;

import java101.elements.PrivateCircle;

public class Circulinho extends PrivateCircle {
	public void makeCircle(){
		printCircle();
		grow();
	}

	public void makeCircle() {
		PrivateCircle pc = new PrivateCircle(1);
		pc.grow(); // does not compile!!!
	}
}
