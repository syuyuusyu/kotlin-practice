package ind.syu.elemental.entity;


public class RoleMenu {

  private long id;
  private long roleId;
  private long menuId;
  private String createBy;
  private String updateBy;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long stateflag;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getStateflag() {
    return stateflag;
  }

  public void setStateflag(long stateflag) {
    this.stateflag = stateflag;
  }

}
