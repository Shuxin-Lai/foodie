package com.imooc.dto.passport;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class QueryUsernameDto {
  @Size(min = 0, max = 256)
  @NotNull()
  String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
