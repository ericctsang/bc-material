package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(50);
    arrayList.remove(1); // by index or by object(except Integer)
    System.out.println(arrayList);
    System.out.println(arrayList.size());
    System.out.println(arrayList.get(0));

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(5);
    integers.add(3);
    arrayList.addAll(integers);
    System.out.println(arrayList);
    System.out.println(arrayList.indexOf(100));

    for (Integer i : arrayList) {
      System.out.println(i);
    }
    System.out.println();

    // String ArrayList
    // Declare ArrayList of String, "Tesla", "Apple", "AWS"
    ArrayList<String> strArr = new ArrayList<>();
    strArr.add("Tesla");
    strArr.add("Apple");
    strArr.add("AWS");
    strArr.add("2");

    // Find the index of Apple, indexof
    int indexOfApple = strArr.indexOf("Apple");
    System.out.println("Index of Apple = " + indexOfApple);

    // List: get and set
    System.out.println(strArr.get(1)); // print Apple
    strArr.set(1, "Watermelon");
    System.out.println(strArr.get(1)); // print Watermelon

    // List: remove by Object or by Index
    strArr.remove("Tesla"); // by object
    System.out.println(strArr);

    // List: contains
    if (!strArr.contains("Tesla")) {
      System.out.println("The list has no Tesla");
    }

    strArr.add("Yellow");
    strArr.add("Blue");
    System.out.println(strArr); // List >> supposed no ordering

    Collections.sort(strArr); // Collections.sort(ArrayList) >> 1,2,3,A,B,C,a,b,c
    System.out.println(strArr);

    //
    ArrayList<Long> longList = new ArrayList<>();
    longList.add(10l);
    longList.add(-10l);
    System.out.println(longList);

    List<Long> longList2 = new ArrayList<>(Arrays.asList(11l, 50l));
    longList2.add(3l);
    System.out.println(longList2);

    List<String> weekdays = Arrays.asList("Mon", "Tue", "Wed", "Thur", "Fri");
    // weekdays.add("Sun"); // This line will cause error

    for (String s : weekdays) {
      System.out.println(s);
    }

  }
}
