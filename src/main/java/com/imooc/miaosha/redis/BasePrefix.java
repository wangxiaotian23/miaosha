package com.imooc.miaosha.redis;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 11:40
 * @Description:
 */
public abstract class BasePrefix implements KeyPrefix {
    private int expireSeconds;

    private String prefix;

    BasePrefix(String prefix) {//0代表永不过期
        this(0, prefix);
    }

    BasePrefix(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    public int expireSeconds() {//默认0代表永不过期
        return expireSeconds;
    }

    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className + ":" + prefix;
    }

}
