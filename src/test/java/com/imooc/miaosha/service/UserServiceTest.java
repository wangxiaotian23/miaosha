package com.imooc.miaosha.service;

import com.imooc.miaosha.domain.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: 李清依
 * @Date: 2019/10/7 14:35
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void getById() {
        User user=userService.getById(1);
        System.out.println(user);
    }
}
