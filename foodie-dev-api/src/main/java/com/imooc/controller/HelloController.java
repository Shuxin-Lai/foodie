package com.imooc.controller;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  private StuMapper stuMapper;

  @GetMapping("/test")
  public Object test() {
    return Constant.SALT;
  }

  @GetMapping("/ping")
  public Object hello() {
    return "hello world";
  }

  @GetMapping("/test_database")
  public Object testDatabase() {
    Stu stu = new Stu();
    stu.setId(1);
    Stu stu1 = stuMapper.selectByPrimaryKey(stu);
    return stu1;
  }
}
