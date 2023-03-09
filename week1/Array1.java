package week1;

import java.util.Arrays;

public class Array1 {
  public static void main(String[] args) {
    int[] array = new int[3];
    array[1] = 100;
    System.out.println(Arrays.toString(array));
    System.out.println(array);

    int[] array2 = new int[] { 10, 30, 55, 99 };
    System.out.println(Arrays.toString(array2));
    array2[1] = 20;
    System.out.println(Arrays.toString(array2));
    System.out.println();

    for (int e : array2) {
      System.out.println(String.valueOf(e)+"*");
    }
    System.out.println();
    System.out.println(Arrays.toString(array2));
    System.out.println();

    // Convert array2 to a String array
    String[] strArray = new String[array2.length];
    for (int i = 0; i < strArray.length; i++) {
      strArray[i] = String.valueOf(array2[i]);
      System.out.println(strArray[i]);
    }
    System.out.println(Arrays.toString(strArray));

  }
}