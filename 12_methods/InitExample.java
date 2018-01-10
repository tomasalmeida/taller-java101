public class InitExample {

  InitExample() {
    System.out.println("Este es un constructor");
  }

  static {
    System.out.println("Este es un bloque estático  de código");
  }

  {
    System.out.println("Este es un bloque NO estático  de código");
  }

  static public void main(String[] args) {
      InitExample variable = new InitExample();
  }
}
