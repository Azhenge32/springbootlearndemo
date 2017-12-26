package com.azhne.springbootlearndemo.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jredis.JredisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.net.UnknownHostException;

/**
 * @author Azhen
 * @date 2017/12/26
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new JredisConnectionFactory();
    }

    @Bean
    public RedisTemplate<Object, Object> redisTemplate() throws UnknownHostException {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory());
        return template;
    }
}
