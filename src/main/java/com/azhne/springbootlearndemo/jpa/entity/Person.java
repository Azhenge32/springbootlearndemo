package com.azhne.springbootlearndemo.jpa.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;

/**
 * @author Azhen
 * @date 2017/12/26
 */
@Entity
@NamedQuery(name = "Person.findByName",
query = "select p from Person p where p.name = ?1")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
