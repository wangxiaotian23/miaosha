package com.imooc.miaosha.redis;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 12:37
 * @Description:
 */
public class AccessKey extends BasePrefix {
    private AccessKey (int expireSeconds,String prefix){
        super(expireSeconds, prefix);
    }
    public static AccessKey withExpire(int expireSeconds){
        return new AccessKey(expireSeconds,"success");
    }

}
