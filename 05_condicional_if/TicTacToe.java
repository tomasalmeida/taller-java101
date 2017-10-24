public class TicTacToe {

  /** devuelve
   * elem si todos son iguales
   * 0 si hay espacios vacíos
   * -1    si hay empate
   */
  public static Integer areEqual(int a, int b, int c) {
    if (a == 0 || b == 0 || c == 0) {
      return new Integer(0);
    } else if (a == b && b == c) {
      return new Integer(a);
    } else {
      return new Integer(-1);
    }
  }

  static public void main(String[] args) {
    /*
       G1 G2 G3 G4
       G5 a1 a2 a3
       G6 b1 b2 b3
       G7 c1 c2 c3
       G8
    */
    int a1 = Integer.parseInt(args[0]);
    int a2 = Integer.parseInt(args[1]);
    int a3 = Integer.parseInt(args[2]);
    int b1 = Integer.parseInt(args[3]);
    int b2 = Integer.parseInt(args[4]);
    int b3 = Integer.parseInt(args[5]);
    int c1 = Integer.parseInt(args[6]);
    int c2 = Integer.parseInt(args[7]);
    int c3 = Integer.parseInt(args[8]);

    if (areEqual(a1, a2, a3) > 0 ||
        areEqual(a1, b1, c1) > 0 ||
        areEqual(a1, b2, c3) > 0) {
      // G5, G2, G1
      System.out.println("Ganó el " + a1);
    } else if (areEqual(c1, c2, c3) > 0 ||
               areEqual(c1, b2, a3) > 0) {
      // G7, G8
      System.out.println("Ganó el " + c1);
    } else if (areEqual(b1, b2, b3) > 0) {
      //g6
      System.out.println("Ganó el " + b1);
    } else if (areEqual(a2, b2, c2) > 0) {
      //g3
      System.out.println("Ganó el " + a2);
    } else if (areEqual(a3, b3, c3) > 0) {
      //g4
      System.out.println("Ganó el " + a3);
    } else if (areEqual(a1, b1, c1) == 0 ||
               areEqual(a2, b2, c2) == 0 ||
               areEqual(a3, b3, c3) == 0) {
      // no ha acabado
      System.out.println("No ha acabado.");
    } else {
      // no ha acabado
      System.out.println("No hay ganador.");
    }
  }
}
