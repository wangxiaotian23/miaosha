package com.imooc.miaosha.redis;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 10:40
 * @Description:
 */
public interface KeyPrefix {
    int expireSeconds();

    String getPrefix();
}
