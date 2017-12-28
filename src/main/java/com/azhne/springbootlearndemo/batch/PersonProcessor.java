package com.azhne.springbootlearndemo.batch;

import com.azhne.springbootlearndemo.jpa.entity.Person;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author Azhen
 * @date 2017/12/28
 */
public class PersonProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {
        String name = person.getName().toUpperCase();
        person.setName(name);
        return person;
    }
}
