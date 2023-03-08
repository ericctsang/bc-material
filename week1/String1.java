package week1;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class String1 {
  public static void main(String[] args) {
    String name = "Today is a nice day.";
    int index = 3;

    System.out.println("hello");
    System.out.println(name.charAt(0)); // index 0 represents the 1st position

    System.out.println(name.charAt(index));
    System.out.println(name.indexOf("a")); // the first 'a'
    System.out.println(name.indexOf("nice")); // a phrase is available too

    System.out.println(name.trim());// remove the beginning " "(space) and the ending " "
    System.out.println(name.replace("a", "A"));

    System.out.println(name.length());
    System.out.println(name.substring(1, 4)); // print "oda", start from 1, end before 4 (not include 4)

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    System.out.println(name.replace(".", " ").concat(", but raining").toLowerCase());

    int a = 10;
    if (a == 10) {
      System.out.println("hello");
    }

    String firstName = "John";
    if ("Mary".equals(firstName)) { // the best way to compare String
      System.out.println("hello");
    } else {
      System.out.println("ya");
    }

    System.out.println();
    System.out.println();

    String s1 = "Hello";
    String s2 = "Hello";
    System.out.println(s1 == s2); // prints true
    System.out.println(s1.equals(s2)); // prints true

    String s3 = new String("Hello");
    String s4 = new String("Hello");
    System.out.println(s3 == s4); // prints false
    System.out.println(s3.equals(s4)); // prints true

    String str = "brown";
    String myString = "The " + "quick " + str + " fox...";
    System.out.println("The quick brown fox..." == myString); // prints false
    System.out.println("The quick brown fox...".equals(myString)); // prints true

    String myString2 = "The " + "quick " + "brown" + " fox...";
    System.out.println("The quick brown fox..." == myString2); // prints true
    System.out.println("The quick brown fox...".equals(myString2)); // prints true

    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    if (i1 == i2) {
      System.out.println("They are same object in Heap");
    } else {
      System.out.println("They are not the same object in Heap"); // will print this
    }

    if (i1.compareTo(i2) == 0) {
      System.out.println("They have equal value"); // will print this
    } else {
      System.out.println("They are not having equal value");
    }

    System.out.println();

    Integer d1 = 127;
    Integer d2 = 127;
    Integer e1 = 128;
    Integer e2 = 128;
    if (d1 == d2) {
      System.out.println("d1 = d2");
    } else {
      System.out.println("d1 != d2");
    }
    if (e1 == e2) {
      System.out.println("e1 = e2");
    } else {
      System.out.println("e1 != e2");
    }

    // Unboxing
    int i = new Integer(50); // supposed -> int i = 50;

    // Autoboxing
    Integer integer = 100; // supposed -> Integer integer = new Integer (100);
    Integer integer1 = 128; // new Integer(128)
    Integer integer2 = 127; // find if there is existing object with value 127 object

    // * only downgrade -> e.g. integer > byte, double > float
    Byte byte2 = new Byte((byte) 10); // by default, 10 is a type of integer
    Float float2 = new Float((float) 10.98); // by default, 10.98 is a type of double

  }
}
