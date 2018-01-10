public class Man {

  final String name;
  String prefix;
  String gender;
  String LastName = "No hay";

  final static private String TOTO = "valor1";

  public Man(String name) {
    this(name, "Sr.");
  }

  public Man(String name, String prefix) {
  	this(name, prefix, "M");
  }

  public Man(String name, String prefix, String gender) {
  	this.name = name;
  	this.prefix = prefix;
  	this.gender = "(" + gender + ")";
  }

  static public void main(String[] args) {
    Man tomas = new Man("Tomas");
    System.out.println(tomas.prefix + " " + tomas.name + " - " + tomas.gender);
  }
}
