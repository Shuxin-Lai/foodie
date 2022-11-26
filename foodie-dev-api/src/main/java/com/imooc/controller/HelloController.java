package com.imooc.controller;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.pojo.vo.UserVO;
import com.imooc.utils.Constant;
import com.imooc.utils.CookieUtils;
import com.imooc.utils.JSONResult;
import com.imooc.utils.JsonUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
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

  @GetMapping("/test_cookie")
  public Object testCookie(
    HttpServletRequest request,
    HttpServletResponse response
  ) {
    String user = CookieUtils.getCookieValue(request, "user", true);

    return JSONResult.success(JsonUtils.jsonToPojo(user, UserVO.class));
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
