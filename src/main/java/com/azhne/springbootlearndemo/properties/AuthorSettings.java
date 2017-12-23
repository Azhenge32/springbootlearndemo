package com.azhne.springbootlearndemo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Azhen
 * @date 2017/12/18
 */
@Component
@ConfigurationProperties(value = "author.properties")
public class AuthorSettings {
    @Value("${author.name}")
    private String name;
    @Value("${author.age}")
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
