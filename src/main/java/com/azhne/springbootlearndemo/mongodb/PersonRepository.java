package com.azhne.springbootlearndemo.mongodb;

import com.azhne.springbootlearndemo.jpa.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author Azhen
 * @date 2017/12/26
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByName(String name);

    @Query("{'age':?0}")
    List<Person> withQueryFieldByAge(Integer age);
}
