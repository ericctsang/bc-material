package Animal;

public class Cat extends Animal {
  String color;

  public Cat(String type, String color) {
    super(type);
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getCat() {
    return this.type + " " + this.color + " Cat";
  }

  @Override
  public String toString() {
    return this.color + " " + super.type + " Cat";
  }

  @Override
  public String sound() {
    System.out.println("Meow");
    return "Meow";
  }

  public static void main(String[] args) {
    Cat cat = new Cat("", "");
    cat.setType("Pet");
    cat.setColor("Orange");

    Cat cat1 = new Cat("Wild", "Orange");
    System.out.println(cat1.getCat());
    System.out.println(cat.getCat());

    Cat cat2 = new Cat("Pet", "Brown");
    System.out.println(cat2.toString());

  }
}
