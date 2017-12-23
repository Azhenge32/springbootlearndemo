package com.azhne.springbootlearndemo.controller;

import com.azhne.springbootlearndemo.properties.AuthorSettings;
import com.azhne.springbootlearndemo.properties.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Azhen
 * @date 2017/12/18
 */
@RestController
public class HelloController {
    @Value("${book.author}")
    private String author;

    @Value("${book.name}")
    private String name;

    @Autowired
    private AuthorSettings authorSettings;

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    String index() {

        //return author + ":" + name + "||" + authorSettings.getName() + ":" + authorSettings.getAge();
        return helloService.sayHello();
    }
}
