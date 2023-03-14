package Building;

public abstract class Building {
  private String name;
  private String location;

  public Building(String name, String location) {
    this.name = name;
    this.location = location;
  }

  public String getName() {
    return this.name;
  }

  public abstract void checkParking();

  public abstract String checkRoom();

}
