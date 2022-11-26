package com.imooc.service;

import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

public interface UserService {
  boolean queryUsernameIsExists(String username);

  Users createUser(UserBO userBo);
}
