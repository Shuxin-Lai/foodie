package com.imooc.controller;

import com.imooc.exception.FoodieException;
import com.imooc.exception.FoodieExceptionEnum;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;
import com.imooc.service.UserService;
import com.imooc.utils.JSONResult;
import javax.validation.Valid;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passport")
@Validated
public class PassportController {

  @Autowired
  private UserService userService;

  @Valid
  @GetMapping("/usernameIsExist")
  public Object queryUsernameIsExists(
    @RequestParam @Length(
      max = 255,
      min = 3,
      message = FoodieExceptionEnum.PARA_ERROR_MSG
    ) String username
  ) {
    if (userService.queryUsernameIsExists(username)) {
      return JSONResult.success();
    }

    return JSONResult.error(FoodieExceptionEnum.USER_NOT_EXIST);
  }

  @PostMapping("/regist")
  public Object regist(@Valid @RequestBody UserBO userBO) {
    String confirmPassword = userBO.getConfirmPassword();
    String password = userBO.getPassword();

    if (!password.equals(confirmPassword)) {
      throw new FoodieException(FoodieExceptionEnum.PASSWORD_NOT_EQUAL);
    }
    Users user = userService.createUser(userBO);
    return JSONResult.success(user);
  }
}
