package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.List;

public interface PersonService {

    int addPerson(Person person);

    List<Person> getPersonList();

    int updatePerson(Person person);

    int deletePerson(int id);

}
