package com.imooc.miaosha.redis;

/**
 * @author 李清依
 * @version 1.0
 * @date 2019/10/8 16:49
 */
public class OrderKey extends BasePrefix {
    public OrderKey(String prefix) {
        super(prefix);
    }
    public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("moug");
}
