package com.imooc.miaosha.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import sun.dc.pr.PRError;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 11:34
 * @Description:
 */
@Service
public class RedisPoolFactory {
    @Autowired
    private RedisConfig redisConfig;
    @Bean
    public JedisPool jedisPoolFactory(){
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        return new JedisPool(poolConfig,redisConfig.getHost(),redisConfig.getPort());
    }
}
