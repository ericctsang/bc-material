package week1;

public class DataType {
  public static void main(String[] args) {
    // char 可用ASCII code表示 e.g. 'A' = 65
    char gender = 'z'; // or 122
    // static int number = 1;

    final int DAYS_OF_A_WEEK = 7; // final >> cant be changed (constant)

    // float and double incur precision loss (精度問題)

    System.out.println(gender);

    // non-primitive data type >> 有功能 e.g. String.valueOf()
    int amount1 = 1000;
    String amount = String.valueOf(amount1);

    int a = 1; // primitive
    Integer b = 1; // non-primitive data type(TYPE)

    a = Integer.MAX_VALUE;
    a = a + 1;
    System.out.println("a = " + a); // overflow

    int i = 200;
    byte j = (byte) i; // downgrade, byte -128 to 127
    System.out.println(j); // print -56 >> coz overflow

    // Opertor
    int x = 10;
    x = x + 1;
    x++;
    x += 1; // x = x + 1;
    x -= 2; // x = x - 2;
    x *= 3; // x = x * 3;
    x /= 11; // x = x / 11;

    System.out.println(x); // x = 3;
    x--; // x = x - 1;
    System.out.println(x); // x = 2;

    // Remainder
    int s = 10;
    int remainder = s % 3;
    System.out.println(remainder); // remainder = 1

    int counter = 0;
    System.out.println(counter); // 0
    System.out.println(++counter); // 1, execute ++ first then println
    System.out.println(counter); // 1
    System.out.println(counter++); // 1 execute println first, then ++
    System.out.println(counter); // 2

  }

}
