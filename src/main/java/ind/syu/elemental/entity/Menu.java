package ind.syu.elemental.entity;

public class Menu {

  private long id;
  private long parentId;
  private long entityId;
  private long hierachy;
  private String name;
  private String icon;
  private String text;
  private String path;
  private String isLeaf;
  private String pagePath;
  private String pageClass;
  private String loadMethod;
  private String menuPath;
  private String defaultQueryObj;
  private String createBy;
  private String updateBy;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long stateflag;
  private long menuOrder;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getEntityId() {
    return entityId;
  }

  public void setEntityId(long entityId) {
    this.entityId = entityId;
  }


  public long getHierachy() {
    return hierachy;
  }

  public void setHierachy(long hierachy) {
    this.hierachy = hierachy;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public String getIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(String isLeaf) {
    this.isLeaf = isLeaf;
  }


  public String getPagePath() {
    return pagePath;
  }

  public void setPagePath(String pagePath) {
    this.pagePath = pagePath;
  }


  public String getPageClass() {
    return pageClass;
  }

  public void setPageClass(String pageClass) {
    this.pageClass = pageClass;
  }


  public String getLoadMethod() {
    return loadMethod;
  }

  public void setLoadMethod(String loadMethod) {
    this.loadMethod = loadMethod;
  }


  public String getMenuPath() {
    return menuPath;
  }

  public void setMenuPath(String menuPath) {
    this.menuPath = menuPath;
  }


  public String getDefaultQueryObj() {
    return defaultQueryObj;
  }

  public void setDefaultQueryObj(String defaultQueryObj) {
    this.defaultQueryObj = defaultQueryObj;
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


  public long getMenuOrder() {
    return menuOrder;
  }

  public void setMenuOrder(long menuOrder) {
    this.menuOrder = menuOrder;
  }

}
