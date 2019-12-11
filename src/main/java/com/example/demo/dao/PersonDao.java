package com.example.demo.dao;

import com.example.demo.model.Person;
import java.util.List;
import java.util.UUID;

public interface PersonDao {

    // method if the id is specified
    int insertPerson(UUID id, Person person);

    // method if the id is not specified
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> getPersonList();

    int updatePerson(Person person);

    int deletePerson(UUID id);
}
