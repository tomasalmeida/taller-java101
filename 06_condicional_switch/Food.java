public class Food {
  static public void main(String[] args) {

		int opcion = 10;
		final int fueraDeCarta = 5;

		// if (opcion == 1) {
		// 	System.out.println("Ternera");
		// } else if (opcion == 2) {
		// 	System.out.println("Cerdo");
		// } else if (opcion == 3) {
		// 	System.out.println("Veggie");
		// } else if (opcion == 4) {
		// 	System.out.println("Pollo");
		// } else if (opcion == fueraDeCarta) {
		// 	System.out.println("Fuera de carta");
		// }



		switch (opcion) {
			case 1:
				System.out.println("Ternera");
				break;
			case 2:
				System.out.println("Cerdo");
				break;
			case 3:
				System.out.println("Veggie");
				break;
			case 4:
				System.out.println("Pollo");
				break;
			default:
			case fueraDeCarta:
				System.out.println("Fuera de carta switch");
				break;
		}

  }
}
