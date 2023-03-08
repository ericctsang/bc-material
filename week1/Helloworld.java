package week1;

public class Helloworld {
  public static void main(String[] args) {
    //primitive data type
    //int stand for Integer, can -ve and +ve
    double age = 23;
    age = age - 0.4 + 10; //32.6
    //naming convertion, caml-case
    double ageWithDp = 23.5;
    double ageWithDp2 =23; // -> 23.0
    double eric = 25;
    boolean booleanisComplete = true;

    //long -> an integer
    int amount = 220000000;
    amount = 1000*10;
    System.out.println("amount=" + amount);

    //char
    char space = ' ';
    char gender = 'F'; // exception (char n = 123; >> ASCII code)
    System.out.println("Space =" + space);
    //non-primitive data type
    String str = "123abc";
    String str2 = "456def";
    String str3 = str + str2;


    eric = 29;

    System.out.println(eric);

  }
}