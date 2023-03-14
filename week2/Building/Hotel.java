package Building;

public class Hotel extends Building {
  private String roomName;
  private String checkInOut;

  public Hotel(String name, String location, String roomName) {
    super(name, location);
    this.roomName = roomName;
  }

  public void checkParking() {
    System.out.println("No Parking");
  }

  public String checkRoom() {
    return "No room Sorry";
  }

  public static void main(String[] args) {
    Hotel hotel = new Hotel("Sheraton", "TST", "Flat 123");

    System.out.println(hotel.getName()); // output: Sheraton
  }

}
