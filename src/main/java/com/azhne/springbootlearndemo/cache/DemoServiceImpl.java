package com.azhne.springbootlearndemo.cache;

import com.azhne.springbootlearndemo.jpa.entity.Person;
import com.azhne.springbootlearndemo.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Azhen
 * @date 2017/12/26
 */
@Service
public class DemoServiceImpl {
    @Autowired
    PersonRepository personRepository;

    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、可以为:" + p.getId() + "数据作了缓存");
        return p;
    }

    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
        personRepository.delete(id);
    }

    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("为id、可以为:" + p.getId() + "数据作了缓存");
        return p;
    }
}
