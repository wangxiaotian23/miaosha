package com.imooc.miaosha.service;

import com.imooc.miaosha.dao.UserDao;
import com.imooc.miaosha.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 李清依
 * @Date: 2019/10/7 12:11
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User getById(int id){
        return userDao.getById(id);
    }
}
