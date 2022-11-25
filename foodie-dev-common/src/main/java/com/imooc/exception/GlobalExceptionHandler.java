package com.imooc.exception;

import com.imooc.utils.JSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(Exception.class)
  @ResponseBody
  public Object handleException(Exception e) {
    System.out.println("exception: " + e);
    return JSONResult.error(FoodieExceptionEnum.SYSTEM_ERROR);
  }

  @ExceptionHandler(ConstraintViolationException.class)
  @ResponseBody
  public Object handleValidationException(ConstraintViolationException e) {

    System.out.println("ConstraintViolationException: " + e);
    String message = e.getMessage();
    int i = message.indexOf(":");
    if (i != -1) {
      message = message.substring(i + 1);
      message = message.trim();
    }
    return new JSONResult(FoodieExceptionEnum.PARA_ERROR.status, message, null);
  }

  @ExceptionHandler(FoodieException.class)
  @ResponseBody
  public Object handleValidationException(FoodieException e) {
    System.out.println("FoodieException: " + e);
    return new JSONResult(e.getStatus(), e.getMsg(), null);
  }
}
