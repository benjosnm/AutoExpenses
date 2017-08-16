package com.my.db;

public class Property_sub_type {
  private Long id;
  private String type;
  private String description;
  private Long condo_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getCondo_id() {
    return condo_id;
  }

  public void setCondo_id(Long condo_id) {
    this.condo_id = condo_id;
  }
}
