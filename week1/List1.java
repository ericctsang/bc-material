package week1;

import java.util.ArrayList;


public class List1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<> ();
    arrayList.add(100);
    arrayList.add(50);
    arrayList.remove(1); // index for remove
    System.out.println(arrayList);
    System.out.println(arrayList.size());
    System.out.println(arrayList.get(0));

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(5);
    integers.add(3);
    arrayList.addAll(integers);
    System.out.println(arrayList);
    System.out.println(arrayList.indexOf(100)); 

    for(Integer i : arrayList){
      System.out.println(i);
    }
    System.out.println();

  }
}
