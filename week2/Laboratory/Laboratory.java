package week2.Laboratory;

public class Laboratory {

  Laboratory laboratory;
  String labName;

  public void setLaboratory(String labName) {
    this.labName = labName;
  }

  public static void main(String[] args) {
    Scientist scientist1 = new Scientist();
    scientist1.setName("Peter");
    scientist1.setStaffNo(12345);
    scientist1.setPosition("Senior Scientist");
    System.out.println();
    scientist1.showPermissions();

    Scientist scientist2 = new Scientist("Eric", 9999);
    scientist2.setPosition("Phy Scientist");
    scientist2.showPermissions();

    
    
  }
}
