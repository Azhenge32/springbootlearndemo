package com.azhne.springbootlearndemo.jpa.repository;

import com.azhne.springbootlearndemo.jpa.entity.Person;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @author Azhen
 * @date 2017/12/26
 */
public class CustomerSpecs {
    public static Specification<Person> personFromHeFei() {
        return new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("address"), "合肥");
            }
        };
    }
}
