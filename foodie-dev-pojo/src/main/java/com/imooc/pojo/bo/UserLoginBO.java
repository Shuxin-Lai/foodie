package com.imooc.pojo.bo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class UserLoginBO {

  @NotNull()
  @Length(min = 3, max = 255)
  String username;


  @NotNull
  @Length(min = 6, max = 255)
  String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
