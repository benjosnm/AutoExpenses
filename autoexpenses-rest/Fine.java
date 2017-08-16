package com.my.db;

public class Fine {
  private Long id;
  private String amount;
  private String status;
  private java.sql.Date creation_date;
  private java.sql.Date due_date;
  private String fine_type;
  private Long external_entity_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public java.sql.Date getCreation_date() {
    return creation_date;
  }

  public void setCreation_date(java.sql.Date creation_date) {
    this.creation_date = creation_date;
  }

  public java.sql.Date getDue_date() {
    return due_date;
  }

  public void setDue_date(java.sql.Date due_date) {
    this.due_date = due_date;
  }

  public String getFine_type() {
    return fine_type;
  }

  public void setFine_type(String fine_type) {
    this.fine_type = fine_type;
  }

  public Long getExternal_entity_id() {
    return external_entity_id;
  }

  public void setExternal_entity_id(Long external_entity_id) {
    this.external_entity_id = external_entity_id;
  }
}
