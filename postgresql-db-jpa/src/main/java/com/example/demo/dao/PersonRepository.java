package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query(value = "SELECT * FROM person WHERE activation = 1", nativeQuery = true)
    List<Person> getActivePersonList();

}
