package week1;

public class Flow {
  public static void main(String[] args) {
    int a = 0;

    // In this scenario, line 8 -> 10 -> 12 -> 13 ->15
    if (a + 1 > 2) { // >, <, <=, >=
      System.out.println("hello");
    } else if (a + 1 == 2) { // = means assignment, == means check if they are
      System.out.println("Code");
    } else {
      System.out.println("yeah");
    }
    // End the if flow

    long b = 100;
    boolean isFemale = true;

    // b == 100, asking you if b equals to 100 -> YES
    // isFemale == false, asking you if isFemale equals to false? -> No
    // Flow: Line 23 -> 25 -> 26
    if (b == 100 && isFemale == false) {
      System.out.println("Hello");
    } else {
      System.out.println("code");
    }

    if (b == 100 || isFemale == false) {
      System.out.println("Yes");
    }

    if (b == 99 || isFemale == false && b + 2 > 101) { // && executes first
      System.out.println("Eric");
    }

    boolean o = false;
    if (!o == false) {
      System.out.println("hello");
    }
    if (o) {// o, asking if o equals to true
      System.out.println("123");
    }
    if (!o) {// !o, asking if o equals to false
      System.out.println("456");
    }

    int numericGrade = 90;
    char letterGrade = ' ';

    switch (numericGrade) {
      case 90: {
        letterGrade = 'A';
        System.out.println("case 90");
        break;
      }
      case 80: {
        letterGrade = 'B';
        System.out.println("case 80");
        break;
      }
      case 70: {
        letterGrade = 'C';
        System.out.println("case 70");
        break;
      }
      case 60: {
        letterGrade = 'D';
        System.out.println("case 60");
        break;
      }
      case 50: {
        letterGrade = 'E';
        System.out.println("case 50");
        break;
      }
      default: {
        letterGrade = 'F';
        System.out.println("case default");
        break;
      }
    }
  }
}
