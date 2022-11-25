package com.imooc.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constant {
  public static String SALT;

  @Value("${constant.salt}")
  public void setSALT(String SALT) {
    Constant.SALT = SALT;
  }
}
