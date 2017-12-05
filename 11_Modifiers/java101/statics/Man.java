package java101.statics;

public class Man {
   private static String prefix = "Sr.";
   private String name;

   public static String getPrefix() {
     return prefix;
   }

   public void corre() {
      //
   }

   public void corre(int km, double x) {
      System.out.println("corri 1km");
      km--;
      double millasQueMeQuedan = km / 1.61;
      if (millasQueMeQuedan > 0) {
         corre(millasQueMeQuedan, 0.0);
      }
   }

   public void corre(double mi, int x) {
      System.out.println("corri 1mi");
      mi--;
      if(mi > 0){
         corre(mi, 0);
      }
   }
}
