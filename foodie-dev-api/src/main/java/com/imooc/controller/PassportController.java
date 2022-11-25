package com.imooc.controller;

import com.imooc.exception.FoodieExceptionEnum;
import com.imooc.service.UserService;
import com.imooc.utils.JSONResult;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/passport")
@Validated
public class PassportController {
  @Autowired
  private UserService userService;

  @Valid
  @GetMapping("/usernameIsExist")
  public Object queryUsernameIsExists(@RequestParam @Length(max = 255, min = 3, message =
      FoodieExceptionEnum.PARA_ERROR_MSG) String username) {

    if (userService.queryUsernameIsExists(username)) {
      return JSONResult.success();
    }

    return JSONResult.error(FoodieExceptionEnum.USER_NOT_EXIST);
  }
}
