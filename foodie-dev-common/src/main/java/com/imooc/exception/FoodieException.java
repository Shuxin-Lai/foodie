package com.imooc.exception;

public class FoodieException extends RuntimeException {
  private final Integer status;
  private final String msg;

  public FoodieException(Integer status, String msg) {
    this.status = status;
    this.msg = msg;
  }

  public FoodieException(FoodieExceptionEnum foodieExceptionEnum) {
    this(foodieExceptionEnum.getStatus(), foodieExceptionEnum.getMsg());
  }

  public Integer getStatus() {
    return status;
  }

  public String getMsg() {
    return msg;
  }
}
