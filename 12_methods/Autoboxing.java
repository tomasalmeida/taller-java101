public class Autoboxing {

  public void scream(String s) { System.out.println("scream S"); }
  public void scream(Object o) { System.out.println("scream O"); }
  public void scream(Long l)   { System.out.println("scream L"); }
  public void scream(Integer i)   { System.out.println("scream I"); }

  static public void main(String[] args) {
    Autoboxing ab = new Autoboxing();
    // ab.scream("Hola");
    // ab.scream(12345L);
    // ab.scream(122234);
    // ab.scream(ab);
    Long elemNullLong = null;
    // ab.scream((Integer) elemNullLong);
  }
}
