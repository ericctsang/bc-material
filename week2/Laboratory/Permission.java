package Laboratory;

public class Permission {
  Boolean phyPermission;
  Boolean chemPermission;
  Boolean bioPermission;

  public Permission(){

  }

  public Permission(Boolean phyPermission, Boolean chemPermission, Boolean bioPermission){
    this.phyPermission = phyPermission;
    this.chemPermission = chemPermission;
    this.bioPermission = bioPermission;

  }

  public void setPhyPermissionOK (){
    this.phyPermission = true;
  }

  public void setChemPermissionOK (){
    this.chemPermission = true;
  }

  public void setBioPermissionOK (){
    this.bioPermission = true;
  }

}
