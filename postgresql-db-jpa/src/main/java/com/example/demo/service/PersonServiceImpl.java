package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    public int addPerson(Person person) {
        return 0;
    }

    public List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(person -> personList.add(person));
        return personList;
    }

    public int updatePerson(Person person) {
        return 0;
    }

    public int deletePerson(int id) {
        return 0;
    }
}
