package com.imooc.exception;

public enum FoodieExceptionEnum {
  SYSTEM_ERROR(20000, FoodieExceptionEnum.SYSTEM_ERROR_MSG),

  INSERT_ERROR(11001, "插入失败"),
  UPDATE_ERROR(11001, "更新失败"),
  DELETE_ERROR(11001, "删除失败"),

  PARA_ERROR(11000, FoodieExceptionEnum.PARA_ERROR_MSG),
  NEED_USER_NAME(10000, FoodieExceptionEnum.NEED_USER_NAME_MSG),
  USER_NOT_EXIST(10001, FoodieExceptionEnum.USER_NOT_EXIST_MSG),
  PASSWORD_NOT_EQUAL(10002, "两次密码不一致"),
  USER_EXIST(10003, "用户已存在");

  public static final String USER_NOT_EXIST_MSG = "用户不存在";
  public static final String NEED_USER_NAME_MSG = "用户名不能为空";
  public static final String SYSTEM_ERROR_MSG = "系统异常";
  public static final String PARA_ERROR_MSG = "参数校验失败";

  Integer status;
  String msg;

  FoodieExceptionEnum(Integer status, String message) {
    this.msg = message;
    this.status = status;
  }

  public String getMsgByStatus(Integer status) {
    for (FoodieExceptionEnum exceptionEnum : FoodieExceptionEnum.values()) {
      if (exceptionEnum.status.equals(status)) {
        return exceptionEnum.msg;
      }
    }
    return null;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return msg;
  }
}
