import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {
  public static void main(String[] toto) {

    Arrays.sort(toto);
    int i = 0;
	  for(String sortedArg : toto) {
		    System.out.println(i++ + " - " + sortedArg);
	  }
    System.out.println(Arrays.binarySearch(toto, "tomas"));


    int[] myList = {2,1,4};

    int temp1 = myList[1]++;
    int temp2 = ++myList[temp1];
    myList[0] = temp2;

    System.out.println(myList[0]);
    System.out.println(myList[1]);
    System.out.println(myList[2]);


    int[] numbers = new int[3];
    int [] numbers2 = new int[3];
    int numbers3[] = new int[3];
    int numbers4 [] = new int[3];
    int[] numbers5 = {9,10,11};
    System.out.println(++numbers5[1]);
    String[] dulces = new String[3];
    String[] palabras = {"hola", "cielito", "lindo"};

    int[][] matrix = new int[3][3];
    int[] matrix2[] = {{1,2,3},{4,5,6},{7,8,9}};
    matrix[0] = matrix2[1];
    System.out.println(matrix[0][1]);

    ArrayList list1 = new ArrayList();
    ArrayList<String> list2 = new ArrayList<>(10);
    ArrayList<String> list3 = new ArrayList<>(list2);
  }
}
