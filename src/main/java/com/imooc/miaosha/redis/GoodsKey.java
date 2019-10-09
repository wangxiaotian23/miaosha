package com.imooc.miaosha.redis;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 12:52
 * @Description:
 */
public class GoodsKey extends BasePrefix {
    private GoodsKey(int expireSeconds,String prefix){
        super(expireSeconds, prefix);
    }
    public static GoodsKey getGoodsList = new GoodsKey(60,"gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");
    public static GoodsKey getMiaoshaGoodsStock = new GoodsKey(0, "gs");
}
