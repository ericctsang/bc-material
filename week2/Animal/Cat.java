package week2.Animal;

public class Cat extends Animal {
  String color;

  public Cat(String type, String color) {
    super(type);
    this.color = color;
  }

  public Cat() {
    super();
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getCat() {
    return this.type + " " + this.color + " Cat";
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.setType("Pet");
    cat.setColor("Orange");

    Cat cat1 = new Cat("Wild", "Orange");
    System.out.println(cat1.getCat());
    System.out.println(cat.getCat());

  }
}
