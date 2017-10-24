public class IMC {

	private boolean isBetween(double imc, double floor, double ceiling) {
		return floor <= imc && imc < ceiling;
	}

	public static void main(String[] args){
		String clas = "";
		short peso = 81;
		double altura = 1.81;
		double imc = peso / (altura * altura);

		System.out.println("Mi imc es " + imc);

		if (isBetween(imc, 0, 16)) {
			clas = "Delgadez Severa";
		} else if (isBetween(imc, 16, 17)) {
			clas = "Delgadez moderada";
		} else if (isBetween(imc, 17, 18.5)) {
			clas = "Delgadez aceptable";
		} else if (isBe)

	}
}
