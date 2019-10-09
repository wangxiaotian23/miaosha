package com.imooc.miaosha.redis;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 13:00
 * @Description:
 */
public class MiaoshaUserKey extends BasePrefix {

    private static final int TOKEN_EXPIRE=3600*24*2;

    MiaoshaUserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static MiaoshaUserKey token = new MiaoshaUserKey(TOKEN_EXPIRE, "tk");
    public static MiaoshaUserKey getById = new MiaoshaUserKey(0, "id");
}
