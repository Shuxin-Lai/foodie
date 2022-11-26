package com.imooc.enums;

public enum Sex {
  WOMAN(0, "女"),
  MAN(1, "男"),
  SECRET(2, "保密");

  private Integer type;
  private String message;

  Sex(Integer type, String message) {
    this.type = type;
    this.message = message;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
