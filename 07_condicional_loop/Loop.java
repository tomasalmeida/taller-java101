public class Loop {
  public static void main(String[] args) {

    int x = 0;
    while (x < 10) {
    	x = ++x;
    	System.out.print(x + " ");
    }
    System.out.println("Salí del bucle");

    for (int i = 1, count = 1 ; i < 50; i+=2, count++) {
	     System.out.println(count + " - " + i);
    }

  }
}
