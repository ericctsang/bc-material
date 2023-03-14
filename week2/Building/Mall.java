package Building;

public class Mall extends Building {
  private String shop;
  String[] abc;

  public Mall(String name, String location, String shop) {
    super(name, location);
    this.shop = shop;
  }

  public void checkParking() {
    System.out.println("2 Parking area");
  }

  public String checkRoom() {
    return "No room in mall";
  }

  @Override
  public String getName() { // output: shop name
    return this.shop;
  }

  public static void main(String[] args) {
    Mall mall = new Mall("IFC", "Central", "Apple");
    System.out.println(mall.getName());
    int a = 30;
    int b = 40;
    int[] list = { 10, 20, 30 };
    System.out.println(calculateReminder(a, b));
    System.out.println(sum(list));
    System.out.println(sum1(new int[] {1,2,3,4}));
  }

  public static double calculateReminder(int a, int b) { // 6/5
    return ((double) a / (double) b) * b;
  }

  public static int sum(int... nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }

  public static int sum1(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }

}
