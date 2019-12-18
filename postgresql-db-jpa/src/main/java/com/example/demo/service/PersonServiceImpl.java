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

    @Override
    public void addPerson(Person person) {
        person.setId(Math.toIntExact(personRepository.count() + 1));
        person.setActivation(0);
        personRepository.save(person);
    }

    @Override
    public List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(person -> personList.add(person));
        return personList;
    }

    @Override
    public void updatePerson(Person person) {
        Person currentPerson = personRepository.findById(person.getId()).get();
        currentPerson.setName(person.getName());
        currentPerson.setActivation(person.getActivation());
        personRepository.save(currentPerson);
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }

    @Override
    public void activatePerson(int id) {
        Person currentPerson = personRepository.findById(id).get();
        currentPerson.setActivation(1);
        personRepository.save(currentPerson);
    }

    @Override
    public void deActivatePerson(int id) {
        Person currentPerson = personRepository.findById(id).get();
        currentPerson.setActivation(0);
        personRepository.save(currentPerson);
    }

    @Override
    public List<Person> getActivePersonList() {
        List<Person> activePersonList = personRepository.getActivePersonList();
        return activePersonList;
    }
}
