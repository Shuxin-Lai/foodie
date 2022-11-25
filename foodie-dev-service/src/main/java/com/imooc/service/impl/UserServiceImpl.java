package com.imooc.service.impl;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UsersMapper usersMapper;

  @Override
  public boolean queryUsernameIsExists(String username) {
    Example example = new Example(Users.class);
    Example.Criteria criteria = example.createCriteria();

    criteria.andEqualTo("username", username);

    Users user = usersMapper.selectOneByExample(example);

    return user != null;
  }
}
