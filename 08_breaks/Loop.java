public class Loop {
  public static void main(String[] args) {
    //
    // LOOP_I: for (int i = 1; i < 20; i++) {
    //   LOOP_J: for (int j = 20; j > i; j--) {
	  //      System.out.print(j + " ");
    //      if (j == 14) {
    //        break LOOP_I;
    //      }
    //   }
    //   System.out.println("");
    // }

    LOOP_I2: for (int i = 1; i < 20; i++) {
      LOOP_J2: for (int j = 20; j > i; j--) {
         if (i == 14) {
           continue LOOP_I2;
         }
         System.out.print(j + " ");
      }
      System.out.println("!");
    }

  }
}
