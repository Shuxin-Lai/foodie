package com.imooc.service.impl;

import com.imooc.exception.FoodieException;
import com.imooc.exception.FoodieExceptionEnum;
import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;
import com.imooc.service.UserService;
import com.imooc.utils.Constant;
import com.imooc.utils.DateUtil;
import com.imooc.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {

  @Autowired
  private UsersMapper usersMapper;

  @Autowired
  private Sid sid;

  @Override
  public boolean queryUsernameIsExists(String username) {
    Example example = new Example(Users.class);
    Example.Criteria criteria = example.createCriteria();

    criteria.andEqualTo("username", username);
    Users user = usersMapper.selectOneByExample(example);
    return user != null;
  }

  @Transactional(propagation = Propagation.REQUIRED)
  @Override
  public Users createUser(UserBO userBo) {
    boolean b = queryUsernameIsExists(userBo.getUsername());
    if (b) {
      throw new FoodieException(FoodieExceptionEnum.USER_EXIST);
    }

    Users user = new Users();
    user.setUsername(userBo.getUsername());
    try {
      user.setPassword(MD5Utils.getMD5Str(userBo.getPassword()));
    } catch (Exception e) {
      e.printStackTrace();
    }

    user.setNickname(userBo.getUsername());
    user.setFace(Constant.USER_DEFAULT.DEFAULT_AVATAR);
    user.setBirthday(
      DateUtil.convertToDate(Constant.USER_DEFAULT.DEFAULT_BIRTHDAY)
    );
    String id = sid.nextShort();
    user.setId(id);

    int i = usersMapper.insertSelective(user);
    if (i != 1) {
      throw new FoodieException(FoodieExceptionEnum.INSERT_ERROR);
    }

    user = usersMapper.selectByPrimaryKey(id);

    return user;
  }

  @Override
  public Users queryUserForLogin(String username, String password)
    throws Exception {
    String encryptedPwd = MD5Utils.getMD5Str(password);
    Example example = new Example(Users.class);

    Example.Criteria criteria = example.createCriteria();
    criteria.andEqualTo("username", username);
    criteria.andEqualTo("password", encryptedPwd);
    return usersMapper.selectOneByExample(example);
  }
}
