package com.my.db;

public class Extra_fee {
  private Long id;
  private Double amount;
  private String status;
  private java.sql.Date creation_date;
  private java.sql.Date due_date;
  private java.sql.Date period;
  private Long property_id;
  private Long fine_configuration_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
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

  public java.sql.Date getPeriod() {
    return period;
  }

  public void setPeriod(java.sql.Date period) {
    this.period = period;
  }

  public Long getProperty_id() {
    return property_id;
  }

  public void setProperty_id(Long property_id) {
    this.property_id = property_id;
  }

  public Long getFine_configuration_id() {
    return fine_configuration_id;
  }

  public void setFine_configuration_id(Long fine_configuration_id) {
    this.fine_configuration_id = fine_configuration_id;
  }
}
