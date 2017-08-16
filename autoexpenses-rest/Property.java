package com.my.db;

public class Property {
  private Long id;
  private String code;
  private String type;
  private Long condo_id;
  private Long sub_type_id;
  private Long owner_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getCondo_id() {
    return condo_id;
  }

  public void setCondo_id(Long condo_id) {
    this.condo_id = condo_id;
  }

  public Long getSub_type_id() {
    return sub_type_id;
  }

  public void setSub_type_id(Long sub_type_id) {
    this.sub_type_id = sub_type_id;
  }

  public Long getOwner_id() {
    return owner_id;
  }

  public void setOwner_id(Long owner_id) {
    this.owner_id = owner_id;
  }
}
