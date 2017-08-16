package com.my.db;

public class Fine_configuration {
  private Long id;
  private Double amount;
  private String amount_type;
  private Long valid_days;
  private String accumulative;
  private Long condo_id;

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

  public String getAmount_type() {
    return amount_type;
  }

  public void setAmount_type(String amount_type) {
    this.amount_type = amount_type;
  }

  public Long getValid_days() {
    return valid_days;
  }

  public void setValid_days(Long valid_days) {
    this.valid_days = valid_days;
  }

  public String getAccumulative() {
    return accumulative;
  }

  public void setAccumulative(String accumulative) {
    this.accumulative = accumulative;
  }

  public Long getCondo_id() {
    return condo_id;
  }

  public void setCondo_id(Long condo_id) {
    this.condo_id = condo_id;
  }
}
