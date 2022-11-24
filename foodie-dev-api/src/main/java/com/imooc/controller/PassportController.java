package com.imooc.controller;

import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/passport")
public class PassportController {
  @Autowired
  private UserService userService;

  @Valid
  @GetMapping("/usernameIsExist")
  public String queryUsernameIsExists(@RequestParam @Size(min = 0, max = 255) String username) {
    return username;
  }
}
