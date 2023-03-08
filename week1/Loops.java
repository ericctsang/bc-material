package week1;

public class Loops {
  public static void main(String[] args) {
    // Approach 1: for loop
    int i = 0;
    for (i = 0; i < 5; i++) { // for (count ; condition to stop ; change of
      System.out.println("hello");
    } // if i = 0, then sysout will run 5 times

    // Approach 2: while loop
    i = 0;
    while (i < 5) {
      System.out.println("hello1");
      i++;
    }

    // Approach 3: do-while loop
    i = 0;
    do {
      System.out.println("hello2");
      i++;
    } while (i < 5);

    // for loop with break
    for (int a = 0; a < 4; a++) {
      System.out.println("a= " + a);
      if (a == 2) {
        break; // this break will exit the for loop
      }
    }

    // Nested for loop
    for (int x = 0; x < 5; x++) {
      for (int y = 0; y < 5; y++) {
        System.out.println("x=" + x + ",y=" + y);
      }
    }

    // x = *
    // y = space
    for (int x = 0; x < 5; x++) {
      for (int y = x; y < 5; y++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }

    System.out.println();

    for (int x = 0; x < 5; x++) {
      for (int y = x; y >= 0; y--) {
        System.out.print("*");
      }
      System.out.println(" ");
    }

    System.out.println();

    for (int x = 1; x < 6; x++) {
      for (int y = x; y >= 0; y--) {
        System.out.print(" ");
      }
      for (int z = (5 - x); z >= 0; z--) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();

    for (int x = 0; x < 5; x++) {
      for (int y = (5 - x); y >= 0; y--) {
        System.out.print(" ");
      }
      for (int z = x; z >= 0; z--) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();

    for (int x = 0; x < 5; x++) {
      for (int y = (5 - x); y >= 0; y--) {
        System.out.print(" ");
      }
      for (int z = x; z >= 0; z--) {
        System.out.print("*");
      }
      for (int v = x; v > 0; v--) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
