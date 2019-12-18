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

    public void addPerson(Person person) {
        person.setId(Math.toIntExact(personRepository.count() + 1));
        personRepository.save(person);
    }

    public List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(person -> personList.add(person));
        return personList;
    }

    public void updatePerson(Person person) {
        Person currentPerson = personRepository.findById(person.getId()).get();
        currentPerson.setName(person.getName());
        personRepository.save(currentPerson);
    }

    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }
}
