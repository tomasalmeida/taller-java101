public class Init {
  {
      System.out.println(text);
  }

  static String text = "D";

  static {
    System.out.println(text);
    text = "B";
  }

  Init (int a) {
    System.out.println("F");
  }

  public Init() {
    this(2);
    System.out.println("A");
  }

  static public void main(String[] args) {
    Init a = new Init();
  }
}
