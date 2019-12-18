package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.List;

public interface PersonService {

    void addPerson(Person person);

    List<Person> getPersonList();

    void updatePerson(Person person);

    void deletePerson(int id);

    void activatePerson(int id);

    void deActivatePerson(int id);

    List<Person> getActivePersonList();
}
