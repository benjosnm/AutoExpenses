package com.my.db;

public class Expense_configuration {
  private Long id;
  private String type;
  private String property_type;
  private Double amount;
  private String attribute;
  private String atribute_value;
  private Long valid_days;
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

  public String getProperty_type() {
    return property_type;
  }

  public void setProperty_type(String property_type) {
    this.property_type = property_type;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public String getAtribute_value() {
    return atribute_value;
  }

  public void setAtribute_value(String atribute_value) {
    this.atribute_value = atribute_value;
  }

  public Long getValid_days() {
    return valid_days;
  }

  public void setValid_days(Long valid_days) {
    this.valid_days = valid_days;
  }

  public Long getCondo_id() {
    return condo_id;
  }

  public void setCondo_id(Long condo_id) {
    this.condo_id = condo_id;
  }
}
