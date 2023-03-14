package Laboratory;

public class Scientist {
  private String name;
  private String position;
  private int staffNo;
  Permission permission;


  public Scientist() { // empty constructor, 
                       // empty constructor is default if no other constructor  

  }

  public Scientist(String name, int staffNo) { // arguement construtor
    this.name = name;
    this.staffNo = staffNo;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setStaffNo(int staffNo) {
    this.staffNo = staffNo;
  }

  public int getStaffNo() {
    return this.staffNo;
  }

  public void setPosition(String position) {
    this.position = position;

    if (position.equals("Senior Scientist")) {
      this.permission.setPhyPermissionOK();
      this.permission.setChemPermissionOK();
      this.permission.setBioPermissionOK();
    }
    if (position.equals("Phy Scientist")) {
      this.permission.setPhyPermissionOK();
    }
    if (position.equals("Chem Scientist")) {
      this.permission.setChemPermissionOK();
    }
    if (position.equals("Bio Scientist")) {
      this.permission.setBioPermissionOK();
    }
  }

  public String getPosition() {
    return this.position;
  }

  public void showPermissions() {
    if (this.permission.phyPermission == true) {
      System.out.println("Phy Lab OK!");
    }
    if (this.permission.chemPermission == true) {
      System.out.println("Chem Lab OK!");
    }
    if (this.permission.bioPermission == true) {
      System.out.println("Bio Lab OK!");
    }
  }

  // public void setPhyPermissionOK() {
  // this.phyPermission = true;
  // }

  // public void setChemPermissionOK() {
  // this.chemPermission = true;
  // }

  // public void setBioPermissionOK() {
  // this.bioPermission = true;
  // }

  // public void showPermissions() {
  // if (this.phyPermission == true) {
  // System.out.println("Phy Lab OK!");
  // }
  // if (this.chemPermission == true) {
  // System.out.println("Chem Lab OK!");
  // }
  // if (this.bioPermission == true) {
  // System.out.println("Bio Lab OK!");
  // }
  // }

}
