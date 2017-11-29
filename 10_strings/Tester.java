public class Tester {
  public static void main(String[] args) {
    // String s1 = "abc";
    // System.out.println(s1);
    // System.out.println(s1.concat("def"));
    // String s2 = s1.concat("xyz");
    // System.out.println(s2);
    // System.out.println(s1);
    //
    // String sa1 = "toto";
    // String sa2 = sa1.concat("ro");
    // sa2.concat("!!!!");
    // System.out.println(sa1);
    // System.out.println(sa2);
    //
    // System.out.println("a                  123abc789       a      ".trim());
    // System.out.println("HolaMundo".toLowerCase().replace("mundo", "Vigo").concat("!!!"));
    // System.out.println("toto".substring(0,2).concat("mas").toUpperCase());

    //
    String stringDelCabron = "      hola             mundo,      soy          cabrón        ";
    String stringLimpia = stringDelCabron.trim();
    while(stringLimpia.contains("  ")) {
      stringLimpia = stringLimpia.replace("  ", " ");
    }
    System.out.println("\"" + stringLimpia + "\"");

    // //solución de Camilo
    String stringLimpia2 = "";
    String[] listaA = stringDelCabron.split(" ");
    for(int i = 0; i < listaA.length; i++ ) {
      if (listaA[i].length() > 0) {
        stringLimpia2 += listaA[i].trim() + " ";
      }
    }
    System.out.println("\"" + stringLimpia2.trim() + "\"");

    //////
    String [] lista = stringDelCabron.split(" ");
    stringDelCabron = "";

    for (int i = 0 ; i <lista.length; i ++){
        System.out.println("-" + lista[i] + "-");
        if (lista[i].equals(" ")){
            lista[i] = "";
        } else{
            lista[i] = lista[i] + " ";
        }
        System.out.println("+" + lista[i] + "+");
        stringDelCabron = stringDelCabron.concat(lista[i]);
    }
    stringDelCabron = stringDelCabron.trim();
    System.out.println("\"" + stringDelCabron.trim() + "\"");
  }
}
