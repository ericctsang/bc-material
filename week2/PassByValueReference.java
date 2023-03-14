public class PassByValueReference {

  public static void doSth(int x) {
    x = 99;
  }

  public static void doSth(Integer x) {
    x = 99;
  }

  public static void doSth(StringBuilder x) {
    x.append(" Lee");
  }

  public static void main(String[] args) {
    // Pass by Value Scenario 1 (Primitive Type)
    int i = 0;
    doSth(i);
    System.out.println(i);

    // Pass by Value Scenario 2 (Wrapper Class)
    Integer j = 10;
    doSth(j);
    System.out.println(j);

    // Pass by Reference (Object Reference)
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("John"); // John
    doSth(stringBuilder);
    System.out.println(stringBuilder); // John Lee
  }
}
