package com.azhne.springbootlearndemo.batch;

import com.azhne.springbootlearndemo.jpa.entity.Person;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

/**
 * @author Azhen
 * @date 2017/12/28
 */
public class ValidProcessor extends ValidatingItemProcessor<Person> {
    @Override
    public Person process(Person item) throws ValidationException {
        super.process(item);
        return item;
    }
}
