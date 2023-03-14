package Animal;

public abstract class Animal {
  String type;


  public Animal(String type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String sound() {
    System.out.println("Meow");
    return "Meow";
  }

}
