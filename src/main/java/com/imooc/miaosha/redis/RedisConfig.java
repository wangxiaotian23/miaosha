package com.imooc.miaosha.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Auther: 李清依
 * @Date: 2019/10/8 10:16
 * @Description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.jedis")
public class RedisConfig {
    private String host;
    private int port;
}
