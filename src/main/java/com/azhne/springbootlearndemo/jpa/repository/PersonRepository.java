package com.azhne.springbootlearndemo.jpa.repository;

import com.azhne.springbootlearndemo.jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Azhen
 * @date 2017/12/26
 */
@RepositoryRestResource(path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> ,
        JpaSpecificationExecutor<Person> {
    List<Person> findByName(String name);

    @Query("select p from Person p where p.address like ?1")
    List<Person> findByNameLike(String name);

    List<Person> findByNameANDAddress(String name, String address);

    @Query("select p from Person p where p.name = :name order by name")
    List<Person> findFirst10ByName(@Param("name") String name);

    @Modifying
    @Transactional
    @Query("update Person p set p.name = :name")
    int setName(@Param("name") String name);

    @RestResource(path = "nameStartsWith", rel="nameStartsWith")
    Person findByNameStartingWith(@Param("name") String name);
}
