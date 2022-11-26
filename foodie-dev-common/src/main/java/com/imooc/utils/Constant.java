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

  public interface USER_DEFAULT {
    final String DEFAULT_AVATAR =
      "https://img1.baidu.com/it/u=900769641," +
      "3909694775&fm=253&fmt=auto&app=138&f=JPEG?w=280&h=280";
    final String DEFAULT_BIRTHDAY = "1970-01-01";
  }
}
