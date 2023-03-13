package week2.School;

public class School {

  int area;
  Student student;

  public School(){

  }

  public static void main(String[] args) {
    Student student = new Student(); // instance or object
    student.setFirstName("John");

    Student student2 = new Student();
    student2.setFirstName("Mary");
    student2.setLastName("Chan");

    System.out.println(student.getFirstName());
    System.out.println(student2.getFirstName());
    System.out.println(" - - - ");

    System.out.println(student2.getFullName());


  }

}
