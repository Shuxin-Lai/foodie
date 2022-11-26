package com.imooc.exception;

import com.imooc.utils.JSONResult;
import java.util.ArrayList;
import javax.validation.ConstraintViolationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public Object handleException(Exception e) {
    System.out.println("exception: " + e);
    return JSONResult.error(FoodieExceptionEnum.SYSTEM_ERROR);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseBody
  public Object handleValidationException(MethodArgumentNotValidException e) {
    System.out.println("MethodArgumentNotValidException: " + e);
    ArrayList<String> strings = new ArrayList<>();
    BindingResult bindingResult = e.getBindingResult();
    for (FieldError fieldError : bindingResult.getFieldErrors()) {
      String field = fieldError.getField();
      String defaultMessage = fieldError.getDefaultMessage();
      strings.add(field + ":" + defaultMessage);
    }

    String message = "";
    if (strings.size() == 1) {
      message = strings.get(0);
    } else {
      message = strings.toString();
    }
    bindingResult.getFieldErrors();
    return new JSONResult(FoodieExceptionEnum.PARA_ERROR.status, message, null);
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
